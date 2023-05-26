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
public class QLDS implements IQLDS{
    List<CaNhan> list = new ArrayList<>();

    public CaNhan finByten(String ten){
        for(CaNhan cn : list)
        {
            if(cn.getHoTen().equalsIgnoreCase(ten)) //equalsIgnoreCase so sánh 2 chuỗi, đúng trã về true else
                return cn;
        }
        return null;
    }
    
//    public void themhocsinh(CaNhan p)
//    {
//        if(p instanceof HocSinh) //instanceof toán tử so sánh 
//        {
//            this.list.add(p);
//        }
//    }
//    
//    public void themGiaoVien(CaNhan p)
//    {
//        if(p instanceof GiaoVien)
//        {
//            this.list.add(p);
//        }
//    }
//    
//    public void inDSHS(){
//        for(int i = 0; i<list.toArray().length; i++)
//        {
//            if(list.get(i) instanceof HocSinh)
//                System.out.println(list.get(i).HienThiTT());
//            
//        }
//        System.out.println("------------------------------------");
//    }
//    
//    public void inDSGV(){
//        for(int i = 0; i < list.toArray().length; i++)
//        {
//            if(list.get(i) instanceof GiaoVien)
//            
//                System.out.println(list.get(i).HienThiTT());
//        }
//        System.out.println("-------------------------------------");
//    }
//    
    
    @Override
    public int them(CaNhan p)
    {
        this.list.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
      CaNhan p = finByten(ten);
      this.list.remove(p);
      return 1;
    }
    
    @Override
    public void inDS()
    {
        for(CaNhan p:list)
            System.out.println(p.HienThiTT());
    }
    
    
}
