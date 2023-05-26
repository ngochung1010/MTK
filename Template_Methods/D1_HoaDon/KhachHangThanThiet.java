package Template_Methods.D1_HoaDon;

public class KhachHangThanThiet extends HoaDon{
    @Override
    protected float TinhChietKhau(float tongtien) {
        float TinhChietKhau;
        if(tongtien >= 500000)
        {
            return TinhChietKhau = tongtien * 0.02f;
        }
        return 0;
    }
}
