/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza_FactoryMethod;

/**
 *
 * @author DELL
 */
public class VNPizzaStore extends PizzaStore{
    //cài đạt các phương thức triều tượng
    
    @Override
    protected Pizza createPizza(PizzaType pt) {
        Pizza pizza = null;
        if(pt == PizzaType.MamTom){
            pizza = new MamTomPizza();
        }
        if(pt == PizzaType.MamCai){
            pizza =  new MamCaiPizza();
        }
        return pizza;
    }
    
}
