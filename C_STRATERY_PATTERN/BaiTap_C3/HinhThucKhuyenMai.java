/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

/**
 *
 * @author DELL
 */
public class HinhThucKhuyenMai implements IKhuyenMai{

    @Override
    public double KhuyenMai(double Tien) {
        // khuyến mãi 10% cho đơn hàng trên 2tr
        if(Tien > 2000000)
        {
            if(Tien*0.1 > 100000) // giãm tối đa 100,000k
                return 100000;
            else
                return Tien*0.1; //giãm 10% giá trị 
        }
        else
            return 0;
    }
    
    
    
}
