/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt1_HoaDon_BuiderPattern;

/**
 *
 * @author DELL
 */
public class CTHD {
    String SanPham;
    int SoLuong;
    double DonGia, ChietKhau;

    public CTHD(String SanPham, int SoLuong, double DonGia, double ChietKhau) {
        this.SanPham = SanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }

    public String getSanPham() {
        return SanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public double getChietKhau() {
        return ChietKhau;
    }

    public void setSanPham(String SanPham) {
        this.SanPham = SanPham;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public void setChietKhau(double ChietKhau) {
        this.ChietKhau = ChietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + 
                "SanPham=" + SanPham + '\t' +
                "SoLuong=" + SoLuong + '\t' +
                "DonGia=" + DonGia + '\t' +
                "ChietKhau=" + ChietKhau + '\n'+'}';
    }
    
    
}
