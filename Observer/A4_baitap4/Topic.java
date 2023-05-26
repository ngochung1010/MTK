package Observer.A4_baitap4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<I_TheoDoiTin> observer = new ArrayList<>();
    List<String> dsTin = new ArrayList<>();

    //giao diện
    public void DangKy(I_TheoDoiTin o){
        if(!observer.contains(o))
        {
            observer.add(o);
        }
    }
    //giao diện
    public void huyDangKy(I_TheoDoiTin o)
    {
        if(observer.contains(o))
        {
            observer.remove(o);
        }
    }
    //giao diện
    public void CapNhatTin(int ViTriCapNhat, String NoiDung)
    {
        int i = 0 ;
        dsTin.set(ViTriCapNhat, NoiDung);
        for (var obs : observer)
            obs.capNhatTin(ViTriCapNhat, NoiDung);


    }
    //giao diện
    public void themTin(String NoiDung)
    {
        dsTin.add(NoiDung);
        for (var obs : observer)
            obs.capNhatTin(-1, NoiDung);
    }
    // interface cho observer
    public static interface I_TheoDoiTin{
        void capNhatTin(int id ,String noiDung);
    }
}
