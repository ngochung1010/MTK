/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza_FactoryMethod;

/**
 *
 * @author DELL
 */
public class MamCaiPizza extends Pizza{

    @Override
    void prepare() {
        builder.append("Luộc thịt heo ba chỉ.\n");
    }

    @Override
    void bake() {
        builder.append("Sắt ra thành từng miếng mõng.\n");
    }

    @Override
    void cut() {
        builder.append("Cuốn rau sống, dưa leo.\n");
    }

    @Override
    void box() {
        builder.append("Cuốn bánh tráng.\n");
    }
    
}
