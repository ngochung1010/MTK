package DECORATOR.B_baitap1;

public class BieuThucDonGian extends BieuThuc{
    float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "" + toanHang;
    }

    @Override
    public float giaTri() {
        return this.toanHang;
    }
}
