/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt2_MyStringBuilder;

/**
 *
 * @author DELL
 */
public class Main_MyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder();
        str.addString("Hello, ");
        str.addFloat(7.8f);
        str.addBool(true );
        System.out.println(str.toString());
        
    }
}
