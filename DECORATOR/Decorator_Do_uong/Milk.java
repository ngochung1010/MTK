package DECORATOR.Decorator_Do_uong;

public class Milk extends CondimentDecorator{
    //hàm khởi tạo
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return 5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }
}
