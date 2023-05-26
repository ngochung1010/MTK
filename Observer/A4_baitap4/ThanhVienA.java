package Observer.A4_baitap4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienA implements Topic.I_TheoDoiTin{
    Topic topic;
    List<String> dsTin = new ArrayList<>();


    public ThanhVienA(Topic topic) {
        this.topic = topic;
        topic.DangKy(this);
    }
    public void huyDangKy()
    {
        topic.huyDangKy(this);
    }

    @Override
    public void capNhatTin(int id, String noiDung) {
        System.out.println("Thành Viên A \n");
        if(id != -1)
        {
            dsTin.set(id, noiDung);
        }
        else
        {
            System.out.println("Tin mới được có nội dung là: " + noiDung + "\n");
            dsTin.add(noiDung);
        }
    }
}
