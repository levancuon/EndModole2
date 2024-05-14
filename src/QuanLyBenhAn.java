import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class QuanLyBenhAn {
    private ArrayList<BenhAn> dsBenhAn;
    BenhAn benhAn = new BenhAn() {
    };
    Validate input = new Validate();

    public QuanLyBenhAn() {
        this.dsBenhAn = new ArrayList<>();
    }


    public void themMoiBenhAn() {
        int choice;
        while (true) {
            System.out.println("Nhập loại bệnh nhân mong muốn:\n" +
                    "1. Bệnh án thường\n" +
                    "2. Bệnh án víp\n" +
                    "3. Thoát.");
            choice = input.getInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập mã bệnh án");
                    int maBenhAn = input.getInt();
                    System.out.println("Nhập tên bệnh nhân");
                    String tenBenhNhan = input.getStr();
                    System.out.println("Nhập mã bệnh nhân");
                    int maBenhNhan = input.getInt();
                    System.out.println("Nhập ngày nhập viện");
                    int ngayNhapVien = input.getDate();
                    System.out.println("Nhập ngày ra viện ");
                    int ngayRaVien = input.getDate();
                    System.out.println("Nhập lý do nhập viện");
                    String lyDoNhapVien = input.getStr();
                    dsBenhAn.add(new BenhAnThuong(maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien));
                case 2:
                    addVip();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("nhập 1->3");
                    break;

            }
        }
    }

    private void addVip() {
        int choice;
       while (true){
           System.out.println("1. gói vip 1\n" +
                   "2. gói vip 2\n" +
                   "3. gói víp 3.\n");
           choice = input.getInt();
           switch (choice) {
               case 1:
                   System.out.println("nhập mã bệnh án");
                   int maBenhAn = input.getInt();
                   System.out.println("Nhập tên bệnh nhân");
                   String tenBenhNhan = input.getStr();
                   System.out.println("Nhập mã bệnh nhân");
                   int maBenhNhan = input.getInt();
                   System.out.println("Nhập ngày nhập viện");
                   int ngayNhapVien = input.getDate();
                   System.out.println("Nhập ngày ra viện ");
                   int ngayRaVien = input.getDate();
                   System.out.println("Nhập lý do nhập viện");
                   String lyDoNhapVien = input.getStr();
                   dsBenhAn.add(new Vip1(maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien));
                   break;
               case 2:
                   System.out.println("nhập mã bệnh án");
                   maBenhAn = input.getInt();
                   System.out.println("Nhập tên bệnh nhân");
                   tenBenhNhan = input.getStr();
                   System.out.println("Nhập mã bệnh nhân");
                   maBenhNhan = input.getInt();
                   System.out.println("Nhập ngày nhập viện");
                   ngayNhapVien = input.getDate();
                   System.out.println("Nhập ngày ra viện ");
                   ngayRaVien = input.getDate();
                   System.out.println("Nhập lý do nhập viện");
                   lyDoNhapVien = input.getStr();
                   dsBenhAn.add(new Vip2(maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien));
                   break;
               case 3:
                   System.out.println("nhập mã bệnh án");
                   maBenhAn = input.getInt();
                   System.out.println("Nhập tên bệnh nhân");
                   tenBenhNhan = input.getStr();
                   System.out.println("Nhập mã bệnh nhân");
                   maBenhNhan = input.getInt();
                   System.out.println("Nhập ngày nhập viện");
                   ngayNhapVien = input.getDate();
                   System.out.println("Nhập ngày ra viện ");
                   ngayRaVien = input.getDate();
                   System.out.println("Nhập lý do nhập viện");
                   lyDoNhapVien = input.getStr();
                   dsBenhAn.add(new Vip3(maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien));
                   break;
               case 4:
                   return;
               default:
                   System.out.println("nhập số 1-4");
           }
       }
    }

    public void xoaBenhAn() {

    }

    public void xemDs() {
        if (!dsBenhAn.isEmpty()) {
            for (BenhAn item : dsBenhAn) {
                System.out.println(item);
            }
        } else {
            System.out.println("ko có bệnh án nào!");
        }
    }

    private void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data/medical_record.csv")));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");




            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void writeFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data/medical_record.csv")));
            bw.write("Số thứ tự bệnh án,Mã bệnh án,Mã bệnh nhân,Tên bệnh nhân,Ngày nhập viện,Ngày ra viện,Lý do nhập viện");
            bw.newLine();
            String line;
            for (BenhAn item : dsBenhAn) {
                line = item.getSoThuTuBenhAn() + "," + item.getMaBenhAn() + "," + item.getMaBenhNhan() +
                        "," + item.getTenBenhNhan() + "," + item.getNgayNhapVien() + "," + item.getNgayRaVien() + "," + item.getLyDoNhapVien();
                bw.write(item.toData());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
