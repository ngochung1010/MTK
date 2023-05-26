/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

/**
 *
 * @author DELL
 */
public class VanChuyenNhanh implements IGiaoHang{

    @Override
    public double phivanchuyen() {
        return 40000; // phí vận chuyển cho vận chuyển nhanh là 40.000VND.
    }

    @Override
    public String TGgiaoHang() {
        return "Giao hàng sau 4 ngày.";
    }
    
    
    
}
