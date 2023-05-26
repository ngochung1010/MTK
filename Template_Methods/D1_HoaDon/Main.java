package Template_Methods.D1_HoaDon;

public class Main {
    public static void main(String[] args) {
        HoaDon hdVang = new KhachHangVang();
        MatHang mh1 = new MatHang("áo MLB", 500000, 2);
        MatHang mh2 = new MatHang("giày Nike", 5000000, 1);

        hdVang.add(mh1);
        hdVang.add(mh2);
        hdVang.HienThi();
    }
}
