package Composite_pattern.ke_hoach_hoc_tap;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHocTap extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();
    @Override
    public String getMonHoc() {
        String tenMH = "";
        for(KeHoachHocTap keHoachHocTap : list)
            tenMH += keHoachHocTap.getMonHoc();
        return tenMH;
    }

    @Override
    public int getoTC() {
        int soTC=0;
        for (KeHoachHocTap keHoacHocTap: list)
            soTC += keHoacHocTap.getoTC();
        return soTC;
    }

    @Override
    public int getHocPhi() {
        int hocPhi=0;
        for (KeHoachHocTap keHoacHocTap: list)
            hocPhi += keHoacHocTap.getHocPhi();
        return hocPhi;
    }

    @Override
    public void add(KeHoachHocTap keHoacHocTap) {
        list.add(keHoacHocTap);
    }

    @Override
    public String toString() {
        return "Tên Môn Học:" + getMonHoc() + "\n" +
                "Tên Số Tính Chỉ: " + getoTC() + "\n" +
                "Tên Học Phí:  " + getHocPhi() ;
    }
}
