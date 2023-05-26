package Observer.A4_baitap4;

import java.util.ArrayList;
import java.util.List;
//thực thi
public class ThanhVienB implements Topic.I_TheoDoiTin{
    Topic topic;
    List<String> dsTin = new ArrayList<>();

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        topic.DangKy(this);
    }
    public void HuyDangKy()
    {
        topic.huyDangKy(this);
    }

    @Override
    public void capNhatTin(int id, String noiDung) {
        System.out.println("Thành Viên B \n");
        if(id != -1)
        {
            dsTin.set(id, noiDung);
            System.out.println("tin thu " + id +" duoc cap nhat voi doi dung la:"+ noiDung + "\n");
        }
        else
        {
            int i = 0;
            dsTin.add(noiDung);
            for (var tin : dsTin)
            {
                System.out.println(" tin: " + i + ", Có nội dung là: " + tin + "\n");
                i++;
            }
        }
    }
}
