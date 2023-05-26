package Template_Methods.D1_HoaDon;

public class KHkimCuong extends HoaDon{
    @Override
    protected float TinhChietKhau(float tongtien) {
        float TinhChietKhau = 0 ;
        if(tongtien >= 15000000)
        {
            return TinhChietKhau = tongtien * 0.06f;
        } else if (tongtien >= 1000000) {
            return  TinhChietKhau = tongtien * 0.05f;
        } else if (tongtien >= 500000) {
            return TinhChietKhau = tongtien * 0.03f;
        }
        return  TinhChietKhau;
    }
}
