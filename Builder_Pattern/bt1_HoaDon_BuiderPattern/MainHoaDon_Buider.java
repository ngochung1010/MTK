/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt1_HoaDon_BuiderPattern;

import Builder_Pattern.bt1_HoaDon_BuiderPattern.CTHD;
import Builder_Pattern.bt1_HoaDon_BuiderPattern.HoaDon;
import Builder_Pattern.bt1_HoaDon_BuiderPattern.HoaDonHeader;

/**
 *
 * @author DELL
 */
public class MainHoaDon_Buider {
    public static void main(String[] args) {
        HoaDonHeader donHeader = new HoaDonHeader("HD01", "thu thảo", "10/20/2023");
        CTHD ct01 = new CTHD("Bia Tiger", 3, 900000, 0.5);
        CTHD ct02 = new CTHD("Mực Khô", 10, 800000, 0.3);
        CTHD ct03 = new CTHD("Cá Khô", 10, 800000, 0.3);
        
        HoaDon hoaDon = new HoaDon.Builder()
                .builderHoaDonHeader(donHeader)
                .builderCTHD(ct01)
                .builderCTHD(ct02)
                .builderCTHD(ct03)
                .build();
        System.out.println(hoaDon.toString());
        
    }
}
