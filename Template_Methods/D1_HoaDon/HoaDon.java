package Template_Methods.D1_HoaDon;

import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {
    List<MatHang> dsMH = new ArrayList<>();

    public void add(MatHang mh){dsMH.add(mh);}
    protected abstract float TinhChietKhau(float tongtien);
    private float TinhTien(){
        float tongtien = 0;
        for (MatHang m:dsMH)
        {
            tongtien += m.getThanhTien();
        }
        return tongtien;
    }
    public void HienThi(){
        System.out.println("Thông Tin Giỏ Hàng: ");
        for (MatHang m:dsMH)
        {
            System.out.println(m.toString());
        }
        float tongTien = TinhTien();
        float tienChietKhau = TinhChietKhau(tongTien);
        float TienSauChietKhau = tongTien - tienChietKhau;
        System.out.println("Tiền Phải Trã: " + TienSauChietKhau);
        System.out.println("Tiền Được chiết khấu: " + tienChietKhau);
        System.out.println("Tiền trước khi được chiết khấu: " + tongTien);
    }

}
