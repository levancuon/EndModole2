import java.util.Date;

public abstract class BenhAn {
    private int soThuTuBenhAn=1;
    private static int soThuTuTangDan=0;
    private int maBenhAn;
    private String tenBenhNhan;
    private int maBenhNhan;
    private int ngayNhapVien;
    private int ngayRaVien;
    private String lyDoNhapVien;

    public BenhAn() {
    }

    public BenhAn(int maBenhAn, String tenBenhNhan, int maBenhNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapVien) {
        this.soThuTuBenhAn = ++soThuTuTangDan;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
        this.maBenhNhan = maBenhNhan;
    }
    public String toData(){
        return soThuTuBenhAn+","+maBenhAn+","+maBenhNhan+","+tenBenhNhan+","+ngayNhapVien+","+ngayRaVien+","+lyDoNhapVien;
    }

    public int getSoThuTuBenhAn() {
        return soThuTuBenhAn;
    }

    public static int getSoThuTuTangDan() {
        return soThuTuTangDan;
    }

    public static void setSoThuTuTangDan(int soThuTuTangDan) {
        BenhAn.soThuTuTangDan = soThuTuTangDan;
    }

    public int getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(int maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public void setSoThuTuBenhAn(int soThuTuBenhAn) {
        this.soThuTuBenhAn = soThuTuBenhAn;
    }

    public int getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(int maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public int getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(int ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public int getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(int ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "soThuTuBenhAn=" + soThuTuBenhAn +
                ", maBenhAn=" + maBenhAn +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien=" + ngayNhapVien +
                ", ngayRaVien=" + ngayRaVien +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
}
