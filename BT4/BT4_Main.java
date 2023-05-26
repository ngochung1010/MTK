/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4;

/**
 *
 * @author DELL
 */
public class BT4_Main {
    public static void main(String[] args) {
        ChuyenXe xe01 = new ChuyenXeNoiThanh("01", 120, "c01", "nguyễn thuận", "xe01", 1000);
        ChuyenXe xe02 = new ChuyenXeNoiThanh("02", 140, "c02", "nguyễn thảo", "xe02", 2000);
        ChuyenXe xe03 = new ChuyenXeNoiThanh("03", 200, "c03", "bích quy", "xe03", 3000);
        ChuyenXe xe04 = new ChuyenXeNgoaiThanh("Hà Nội", 30, "c04", "thanh thảo", "xe04", 4000);
        ChuyenXe xe05 = new ChuyenXeNgoaiThanh("Thanh Hóa", 20, "c05", "thanh hùng", "xe05", 5000);
        ChuyenXe xe06 = new ChuyenXeNgoaiThanh("Đà Nẵng", 28, "c06", "thanh thảo", "xe06", 6000);
        
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.them(xe06);
        qlcx.them(xe05);
        qlcx.them(xe04);
        qlcx.them(xe03);
        qlcx.them(xe02);
        qlcx.them(xe01);
        
        qlcx.xuatDS();

    }
}
