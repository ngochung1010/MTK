/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author DELL
 */
public class MainSingleton {
    
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();
        s1.tang();
        System.out.println("s1: "+ s1.getTam());
        s1.tang();
        s2.tang();
        System.out.println("s1: "+ s1.getTam());
        System.out.println("s2: "+ s2.getTam());
    }
}
