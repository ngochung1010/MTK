/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

/**
 *
 * @author DELL
 */
public class VanChuyenNinjaVan implements IGiaoHang{

    @Override
    public double phivanchuyen() {
        return 30000; //phí vận chuyển của Ninja Van là 30.000VND.
    }

    @Override
    public String TGgiaoHang() {
        return "Giao hàng sau 5 ngày.";
    }
    
    
    
}
