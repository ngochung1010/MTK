/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5;

/**
 *
 * @author DELL
 */
public class BT5_Main {
    public static void main(String[] args) {
        HocSinh hs01 = new HocSinh("cntt2", "hát", "thanh thảo", "phú yên", "035514236", 21);
        HocSinh hs02 = new HocSinh("cntt3", "đánh trống", "thanh hùng", "cam ranh", "0321231231", 22);
        LopHoc lh = new LopHoc();
        lh.themhocsinh(hs02);
        lh.themhocsinh(hs01);
        lh.inDSHS();
        
        System.out.println("------------------------------------------------------------------------------------");
        
        GiaoVien gv01 = new GiaoVien("nhạc cụ dân gian", "âm nhạc", "thúy", "hà nội", "0121231223", 42);
        GiaoVien gv02 = new GiaoVien("thanh nhạc", "âm nhạc", "ngoan", "TP Hồ Chí Minh", "0312321231", 45);
        lh.themGiaoVien(gv02);
        lh.themGiaoVien(gv01);
        lh.inDSGV();       
    }
}
