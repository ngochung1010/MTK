/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C1;

/**
 *
 * @author DELL
 */
public class Main_Tinh {
    public static void main(String[] args) {
        context TINH = new context();
        Tinh tt = new Cong();
        TINH.setTinhtoan(tt);
        System.out.println(TINH.tinh(75, 12));
        System.out.println("--------------------------------------------------");
        Tinh tt1 = new Tru();
        TINH.setTinhtoan(tt1);
        System.out.println(TINH.tinh(54, 78));
        System.out.println("--------------------------------------------------");
        Tinh tt2 = new Nhan();
        TINH.setTinhtoan(tt2);
        System.out.println(TINH.tinh(5, 5));
        System.out.println("--------------------------------------------------");
        Tinh tt3 = new Chia();
        TINH.setTinhtoan(tt3);
        System.out.println(TINH.tinh(10, 2));
        
    }
}
