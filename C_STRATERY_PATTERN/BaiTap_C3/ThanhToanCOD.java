/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

/**
 *
 * @author DELL
 */
public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhtoan(int tienhang) {
        if(tienhang >= 1000000)
            return tienhang*0.03;
        else
            return tienhang;
    }
    
}
