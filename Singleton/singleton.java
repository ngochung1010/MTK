/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author DELL
 */
public class singleton {
    private static singleton instance;
    int tam = 0;
    
    private singleton(){
        
    }
    
    public static singleton getInstance(){
        if(instance == null)
            instance = new singleton();
        return instance;
    }
    
    public void tang(){
        tam++;
    }
    
    public int getTam() {
        return tam;
    }
    
}
