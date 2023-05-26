package BT4;

import java.util.List;
import java.util.ArrayList;


public class QuanLyChuyenXe {
    List<ChuyenXe> dscx = new ArrayList<>();
    
    public void them(ChuyenXe cx){
        this.dscx.add(cx);
    }
    
    public  void xuatDS(){
        for(ChuyenXe c: dscx)
            System.out.print(c.toString());
    }
    
    public int DoanhThuXeNoiThanh(){
        int tong = 0;
        for(ChuyenXe c:dscx)
            if(c instanceof ChuyenXeNoiThanh){
                tong += c.doanhthu;
            }
        return tong;
    }
    
    
    public int DoanhThuXeNgoaiThanh(){
        int tong = 0;
        for(ChuyenXe c:dscx)
            if(c instanceof ChuyenXeNgoaiThanh){
                tong += c.doanhthu;
            }
        return tong;
    }
}
