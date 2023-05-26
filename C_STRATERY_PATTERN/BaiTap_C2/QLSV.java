/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QLSV {
    ISoSanh soSanh;
    List<SinhVien> DSSV= new ArrayList<>();
    
    public QLSV(){
        
    }

    public QLSV(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }

    public ISoSanh getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void sapXep(){
        //cài đặt phương thức comparator
        DSSV.sort((o1, o2) -> soSanh.soSanh(o1, o2));
    }
//    public void sapXep(){
//        for(int i=0; i<DSSV.size() -1; i++)
//            for(int j=i+1; j<DSSV.size(); j++)
//        {
//                if(soSanh.soSanh(DSSV.get(i), DSSV.get(j))>0)
//                    Collections.swap(DSSV, i, j);
//        }
//    }
    
    public void inDS(){
        for(int i=0; i<DSSV.size(); i++)
        {
            DSSV.get(i).Display();
        }
    }
    
    public void themSV(SinhVien addSV){
        DSSV.add(addSV);
    }
    
    
}
