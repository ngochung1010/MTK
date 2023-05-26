/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBSERVER_PATTERN.observers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class TiGia {
    List<I_TheoGioiTiGia> observers = new ArrayList<>();
    float TiGia;
    public void attach(I_TheoGioiTiGia o){
        if(observers.contains(o)){
            observers.add(o);
        }
    }
    
    public void detach(I_TheoGioiTiGia o){
        if(observers.contains(o)){
            observers.remove(o);
        }
    }
    
    public void notifi(float delta){
        TiGia+=delta;
        for(I_TheoGioiTiGia thaydoi : observers){
            thaydoi.capNhatTiGia(TiGia);
        }
    }
    
    public interface I_TheoGioiTiGia{
        void capNhatTiGia(float delta);
    }
    
}
