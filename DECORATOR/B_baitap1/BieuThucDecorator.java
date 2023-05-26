package DECORATOR.B_baitap1;

public class BieuThucDecorator extends BieuThuc{

    BieuThuc bieuthuc;

    public BieuThucDecorator(BieuThuc bieuthuc) {
        this.bieuthuc = bieuthuc;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuthuc.bieuThuc();
    }


}
