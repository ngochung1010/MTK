package DECORATOR.B_baitap1;

public class Cong extends BieuThucDecorator{
    float toanHang;

    public Cong(BieuThuc bieuthuc, float toanHang) {
        super(bieuthuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + "+" + toanHang;
    }
}
