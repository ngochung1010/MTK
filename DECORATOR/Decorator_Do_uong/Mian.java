package DECORATOR.Decorator_Do_uong;

public class Mian {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Bạn muốn uống gì: ");
        b = new Milk("Sửa tươi", b);
        System.out.println(b.getDescription());
        System.out.println("Giá: " + b.cost());
    }
}
