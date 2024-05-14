import java.util.Date;

public class BenhAnVip extends BenhAn{
    protected String goiVip;
    protected Date thoiHanVip;
    public BenhAnVip( int maBenhAn, String tenBenhNhan,int maBenhNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapVien) {
        super( maBenhAn, tenBenhNhan,maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);

    }
}
