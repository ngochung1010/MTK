/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duck;

/**
 *
 * @author DELL
 */
public class MainDuck {
    public static void main(String[] args) {
        duck vd = new vitbau();
        vd.setQuackBehavior(new SQuack());
        vd.setFlyBehavior(new RoundFly());
        vd.display();
        vd.setQuackBehavior(new MuteQuack());
        vd.display();
        
    }
}
