/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

/**
 *
 * @author DELL
 */
public class MatHang {
    String TenMH;
    int SoLuong, DonGia;
    
    public MatHang(String TenMH, int SoLuong, int DonGia) {
        this.TenMH = TenMH;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getTenMH() {
        return TenMH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

   
    
    public void Display(){
        System.out.println("Ten mat hang: " +TenMH);
        System.out.println("So luong hang hoa: " +SoLuong);
        System.out.println("Don gia hang hoa: " +DonGia + "\n");
    }
}
