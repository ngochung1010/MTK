/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt2_MyStringBuilder;

/**
 *
 * @author DELL
 */
public class MyStringBuilder {
    String str = "";

    public MyStringBuilder(String str) {
        this.str = str;
    }
     
    public MyStringBuilder() {
    }
    
    public MyStringBuilder addString(String s){
        this.str += s;
        return this;
    }
    public MyStringBuilder addFloat(float f){
        this.str += Float.toString(f);
        return this;
    }
    public MyStringBuilder addBool(boolean b){
        this.str += Boolean.toString(b);
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
    
    
}
