/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C2;
/**
 *
 * @author DELL
 */
public class BaiTap_C2_Main {
    
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        SinhVien sv01 = new SinhVien("Nguyen Van A", "10/10/2001", 9);
        SinhVien sv02 = new SinhVien("Nguyen Van B", "12/12/2001", 8);
        SinhVien sv03 = new SinhVien("Nguyen Van C", "1/12/2001", 7);
        
        qlsv.themSV(sv01);
        qlsv.themSV(sv03);
        qlsv.themSV(sv02);
        
        System.out.println("Danh sach sinh vien vua duoc khoi tao:");
        qlsv.inDS();
        
        ISoSanh sstheoten = new SoSanhTheoTen();
        ISoSanh sstheodiem = new SoSanhTheoDiem();
        
        qlsv.setSoSanh(sstheoten);
        qlsv.sapXep();
        System.out.println("Danh sách được so sánh theo tên: ");
        qlsv.inDS();
        
        qlsv.setSoSanh(sstheodiem);
        qlsv.sapXep();
        System.out.println("Danh sách được so sánh theo điểm: ");
        qlsv.inDS();
        
        
        
    }
}
