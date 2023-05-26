/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt6_DataAccess;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DataAccessor {
    private static DataAccessor instance;
    private List<SanPham> list = new ArrayList<>();
    
    // cài đặt sinleton
    public static DataAccessor getInstance(){
        if(instance == null)
            instance = new DataAccessor();
        return instance;
    }
    
    public void themSanPham(SanPham sp){
        list.add(sp);
    }
    public void xoaSanPham(SanPham sp){
        list.remove(sp);
    }
}
