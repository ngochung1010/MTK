/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

/**
 *
 * @author DELL
 */
public abstract class CaNhan {
    String HoTen, DiaChi, SDT;
    int tuoi;

    public CaNhan(String HoTen, String DiaChi, String SDT, int tuoi) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    //hiển thị 
    public String HienThiTT() {
        return "CaNhan{" + "HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", SDT=" + SDT + ", tuoi=" + tuoi + '}';
    }
}
