/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

/**
 *
 * @author DELL
 */
public class HocSinh extends CaNhan{
    String lop, nangkhieu;

    public HocSinh(String lop, String nangkhieu, String HoTen, String DiaChi, String SDT, int tuoi) {
        super(HoTen, DiaChi, SDT, tuoi);
        this.lop = lop;
        this.nangkhieu = nangkhieu;
    }

    public String getLop() {
        return lop;
    }

    public String getNangkhieu() {
        return nangkhieu;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangkhieu(String nangkhieu) {
        this.nangkhieu = nangkhieu;
    }
    
    //hiển thị 
    @Override
    public String HienThiTT() {
        return super.HienThiTT() + ", lop=" + lop + ", nangkhieu=" + nangkhieu + '}';
    }
   
    
}
