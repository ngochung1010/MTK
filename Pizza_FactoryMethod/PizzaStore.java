/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza_FactoryMethod;

/**
 *
 * @author DELL
 */
 public abstract class PizzaStore {
    abstract protected Pizza createPizza(PizzaType t);
    public Pizza orderPizza(PizzaType t){
        Pizza pizza;
        pizza = createPizza(t);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
