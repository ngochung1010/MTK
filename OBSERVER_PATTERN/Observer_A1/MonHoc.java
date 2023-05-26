/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBSERVER_PATTERN.Observer_A1;

/**
 *
 * @author DELL
 */
public class MonHoc {
    String maMH, tenMH;
    int soTT;

    public MonHoc(String maMH, String tenMH, int soTT) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTT = soTT;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTT() {
        return soTT;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoTT(int soTT) {
        this.soTT = soTT;
    }

    @Override
    public String toString() {
        return  "maMH: " + maMH + '\n' +
                "tenMH: " + tenMH + '\n' +
                "soTT: " + soTT ;
    }
    
}
