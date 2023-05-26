/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Chain.B1_ATM;

/**
 *
 * @author DELL
 */
public class Main_ATM {
    public static void main(String[] args) {
        IRutTienATM menhgia1 = new RutTien(500);
        IRutTienATM menhgia2 = new RutTien(200);
        IRutTienATM menhgia3 = new RutTien(100);
        IRutTienATM menhgia4 = new RutTien(50);
        IRutTienATM menhgia5 = new RutTien(20);
        IRutTienATM menhgia6 = new RutTien(10);
        IRutTienATM menhgia7 = new RutTien(5);
        IRutTienATM menhgia8 = new RutTien(2);
        IRutTienATM menhgia9 = new RutTien(1);
        
        menhgia1.MenhGiaKeTiep(menhgia2)
                .MenhGiaKeTiep(menhgia3)
                .MenhGiaKeTiep(menhgia4)
                .MenhGiaKeTiep(menhgia5)
                .MenhGiaKeTiep(menhgia6)
                .MenhGiaKeTiep(menhgia7)
                .MenhGiaKeTiep(menhgia8)
                .MenhGiaKeTiep(menhgia9);
        menhgia1.IRutTienATM(750);
                
    }
 
}
