/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class LopHoc {
    List<HocSinh> listHS = new ArrayList<>();
    List<GiaoVien> listGV = new ArrayList<>();
    
    public int themhocsinh(HocSinh hs){
        this.listHS.add(hs);
        return 1;
    }
    
    public int themGiaoVien(GiaoVien gv){
        this.listGV.add(gv);
        return 1;
    }
    
    public int inDSHS(){
        for(HocSinh hs: listHS)
            System.out.println(hs.HienThiTT());
        return 1;
    }
    
    public int inDSGV(){
        for(GiaoVien gv: listGV)
            System.out.println(gv.HienThiTT());
        return 1;
    }
    
}
