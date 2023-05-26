/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

/**
 *
 * @author DELL
 */
public class baitap_Mian {
    public static void main(String[] args) {
        NhanVien nva = new NhanVien("hùng", "khanh hoa", 20, 120, 75);
        NhanVien nvb = new NhanVien("quy", "phú yên", 21, 201, 80);
        NhanVien nvc = new NhanVien("thao", "cam ranh", 23, 180, 90);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.themNV(nva);
        qlnv.themNV(nvc);
        qlnv.themNV(nvb);
        qlnv.inDS();
    }
}
