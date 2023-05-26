/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

/**
 *
 * @author DELL
 */
public class ThanhToanAirpay implements IThanhToan{

    @Override
    public double thanhtoan(int tienhang) {
        if(tienhang >= 2000000)
            return tienhang*0.02;
        else
            return tienhang;
    }
    
}
