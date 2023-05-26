/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza_FactoryMethod;

/**
 *
 * @author DELL
 */
public class Pizza_Mian {
    public static void main(String[] args) {
        PizzaStore store = new VNPizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.MamTom);
        System.out.println(pizza.toString());
        Pizza pizza1 = store.orderPizza(PizzaType.MamCai);
        System.out.println(pizza1.toString());
    }
}
