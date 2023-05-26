/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

/**
 *
 * @author DELL
 */
public class BaiTap_C3_Main {
    public static void main(String[] args) {
        MatHang mh01 = new MatHang("bia tiger", 1, 320000);
        MatHang mh02 = new MatHang("khăn ướt", 1, 5000);
        MatHang mh03 = new MatHang("giây chuyền DNJ", 2, 3000000);
        
        GioHang gh = new GioHang();
        gh.themMH(mh01);
        gh.themMH(mh02);
        gh.themMH(mh03);
        
        IKhuyenMai km = new HinhThucKhuyenMai();
        gh.setiKhuyenMai(km);
        IThanhToan tt = new ThanhToanCOD();
        gh.setThanhToan(tt);
        IGiaoHang vc = new VanChuyenNhanh();
        gh.setGiaoHang(vc);
        
        gh.HienThi();
        
    }
}
