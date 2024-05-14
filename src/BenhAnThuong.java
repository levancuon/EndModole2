import java.util.Date;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;


    public BenhAnThuong( int maBenhAn, String tenBenhNhan, int maBenhNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapVien) {
        super( maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }
}
