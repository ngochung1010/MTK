/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DELL
 */
public class QuanLyNhanVien implements IQuanLy{
    List<NhanVien> list = new ArrayList<>();
    
    @Override
    public void themNV(NhanVien nv) {
        this.list.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien nv: list)
            System.out.println(nv.getThongTin());
    }
    
}
