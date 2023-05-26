/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4;

/**
 *
 * @author DELL
 */
public abstract class ChuyenXe {
    String maSoChuyen, taixe, soXe;
    int doanhthu;
    
    //hàm khởi tạo constructor

    public ChuyenXe(String maSoChuyen, String taixe, String soXe, int doanhthu) {
        this.maSoChuyen = maSoChuyen;
        this.taixe = taixe;
        this.soXe = soXe;
        this.doanhthu = doanhthu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public String getTaixe() {
        return taixe;
    }

    public String getSoXe() {
        return soXe;
    }

    public int getDoanhthu() {
        return doanhthu;
    }
    

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setTaixe(String taixe) {
        this.taixe = taixe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhthu(int doanhthu) {
        this.doanhthu = doanhthu;
    }
    
}
