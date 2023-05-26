/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt7_Computer_BuilderPattern;

/**
 *
 * @author DELL
 */
public class ComputerMain {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
        .builderCPU("core i8")
        .builderRAM("32GB ram SamSung")
        .builderScreen("20IN")
        .builderStorage("1T SSD")
        .build();
        System.out.println(c.toString());
        
    }
}
