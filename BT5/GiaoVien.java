/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

/**
 *
 * @author DELL
 */
public class GiaoVien extends CaNhan{
    String monDay, toBoMon;

    public GiaoVien(String monDay, String toBoMon, String HoTen, String DiaChi, String SDT, int tuoi) {
        super(HoTen, DiaChi, SDT, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT()+ ", monday=" + monDay + ", tobomon=" + toBoMon + '}'; 
    }
    
}
