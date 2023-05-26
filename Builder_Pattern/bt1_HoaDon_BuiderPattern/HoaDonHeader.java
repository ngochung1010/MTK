/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt1_HoaDon_BuiderPattern;

/**
 *
 * @author DELL
 */
public class HoaDonHeader {
    String MaHD, TenKH, NgayBan;

    public HoaDonHeader(String MaHD, String TenKH, String NgayBan) {
        this.MaHD = MaHD;
        this.TenKH = TenKH;
        this.NgayBan = NgayBan;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + 
                            "MaHD=" + MaHD + '\t' +
                            "TenKH=" + TenKH + '\t' +
                            "NgayBan=" + NgayBan + '}';
    }
    
    
}
