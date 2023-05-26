package Composite_pattern.ke_hoach_hoc_tap;

public class Main {
    public static void main(String[] args) {
        MonHoc mh1 = new MonHoc("MTK", 5, 300);
        MonHoc mh2 = new MonHoc("\t, LTDD", 4,400);

        KeHoachHocTap hocTap = new QuanLyHocTap();
        hocTap.add(mh1);
        hocTap.add(mh2);
        System.out.println(hocTap.toString());
    }
}
