/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza_FactoryMethod;

/**
 *
 * @author DELL
 */
public class MamTomPizza extends Pizza{

    //cài đạt các phương thức triều tượng
    @Override
    void prepare() {
        builder.append("Mắm tôm và thịt chó ướp riềng, mẽ.\n");
    }

    @Override
    void bake() {
        builder.append("Nướng trên than 15p.\n");
    }

    @Override
    void cut() {
        builder.append("chia thành 10 phần.\n");
    }

    @Override
    void box() {
        builder.append("Đóng hộp.\n");
    }

}
