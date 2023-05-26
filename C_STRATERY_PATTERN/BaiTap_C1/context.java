/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C1;

import C_STRATERY_PATTERN.BaiTap_C1.Tinh;

/**
 *
 * @author DELL
 */
public class context {
   
    private Tinh tinhtoan;

    
    public Tinh getTinhtoan() {
        return tinhtoan;
    }
    
    public void setTinhtoan(Tinh tinhtoan) //thiết lập gt
    {
        this.tinhtoan = tinhtoan;
    }
    
    public float tinh(float a, float b){
        return tinhtoan.Tinh(a, b);
    }
    
}
