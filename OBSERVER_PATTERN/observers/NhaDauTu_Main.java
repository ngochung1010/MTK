/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBSERVER_PATTERN.observers;

/**
 *
 * @author DELL
 */
public class NhaDauTu_Main {
    public static void main(String[] args) {
        TiGia tg = new TiGia();
        NhaDauTuA a = new NhaDauTuA(tg);
        NhaDauTuB b = new NhaDauTuB(tg);
        System.out.println("Lần 1");
        a.capNhatTiGia(0);
        tg.notifi(1);
    }
}
