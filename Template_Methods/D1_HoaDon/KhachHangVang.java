package Template_Methods.D1_HoaDon;

public class KhachHangVang extends HoaDon{
    @Override
    protected float TinhChietKhau(float tongtien) {
        float TinhChietKhau = 0;
        if(tongtien>=1000000)
        {
            return TinhChietKhau = tongtien * 0.05f;
        }
        else if(tongtien >= 500000)
        {
            return TinhChietKhau = tongtien * 0.03f;
        }
        return TinhChietKhau;
    }
}
