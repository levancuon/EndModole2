import java.util.Date;

public class Vip1 extends BenhAnVip {

    public Vip1( int maBenhAn, String tenBenhNhan,int maBenhNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapVien) {
        super( maBenhAn, tenBenhNhan, maBenhNhan,ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.goiVip = "vip 1";
    }
}
