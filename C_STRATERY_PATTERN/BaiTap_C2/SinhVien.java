/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C2;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String hoTen, ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, String ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }


    public float getDiemTB() {
        return diemTB;
    }

    

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }


    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    
    public void Display()
    {
        System.out.println("Ho ten cua sinh vien: " + hoTen);
        System.out.println("Ngay Sinh Cua Sinh Vien: " + ngaySinh);
        System.out.println("Diem trung binh cua sinh vien: " + diemTB);
        System.out.println("\n");
    }
    
}
