/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt1_HoaDon_BuiderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class HoaDon {
    HoaDonHeader  HD;
    List<Builder_Pattern.bt1_HoaDon_BuiderPattern.CTHD> CTHD = new ArrayList<>();
    
    private HoaDon(Builder h){
        this.HD = h.hd;
        this.CTHD = h.DSHD;
    }

    @Override
    public String toString() {
        return "HoaDon{" + 
                "HD=" + HD + '\n' +
                "CTHD=" + CTHD  + '}';
    }
    
    public static class Builder{
        HoaDonHeader hd;    
        List<CTHD> DSHD = new ArrayList<>();
        
        public Builder builderHoaDonHeader(HoaDonHeader hd){
            this.hd = hd;
            return this;
        }
        public Builder builderCTHD(CTHD cthd){
            this.DSHD.add(cthd);
            return this;
        }
        public HoaDon build()
        {
            return new HoaDon(this); 
        }
    }
    
    
}
