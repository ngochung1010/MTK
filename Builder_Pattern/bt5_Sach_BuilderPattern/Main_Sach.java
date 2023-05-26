/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt5_Sach_BuilderPattern;

/**
 *
 * @author DELL
 */
public class Main_Sach {
    public static void main(String[] args) {
        Sach s = new Sach.Builder()
                .addTenSach("Tam Quốc")
                .addTacGia("Trương Phi")
                .addSoTrang(96)
                .addChapters("Chương 1")
                .Build();
        System.out.println(s.toString());
                
        
    }
}
