/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C2;

/**
 *
 * @author DELL
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    // Thực hiện so sánh theo điểm và trả về giá trị -1, 0, hoặc 1
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getDiemTB() < o2.getDiemTB())
            return -1;
        else if(o1.getDiemTB() > o2.getDiemTB())
            return 1;
        else
            return 0;
            
    }
}
