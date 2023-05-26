/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBSERVER_PATTERN.observers;

/**
 *
 * @author DELL
 */
public class NhaDauTuA implements TiGia.I_TheoGioiTiGia{
    TiGia tg;
    
    public NhaDauTuA (TiGia tg){
        this.tg = tg;
        tg.attach(this);
    }
    
    public void HuyDangKy(){
        tg.attach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if(delta>0){
            System.out.println("sds");
        }else{
            if(delta == 0){
                System.out.println("sdf");
            }else{
                System.out.println("sas");
            }
        }
    }

    
    
}
