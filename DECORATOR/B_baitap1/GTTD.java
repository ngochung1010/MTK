package DECORATOR.B_baitap1;

public class GTTD extends BieuThucDecorator{
    public GTTD(BieuThuc bieuthuc) {
        super(bieuthuc);
    }

    @Override
    public float giaTri() {
        return Math.abs(super.giaTri()) ;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc();
    }
}
