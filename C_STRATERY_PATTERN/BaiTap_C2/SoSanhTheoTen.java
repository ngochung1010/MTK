/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C2;

/**
 *
 * @author DELL
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    // so sánh theo tên dùng compareTo, so sánh các chuỗi cho trước.
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());   
    }
    
}
