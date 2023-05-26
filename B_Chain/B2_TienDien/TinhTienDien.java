package B_Chain.B2_TienDien;

public class TinhTienDien implements ITinhTienDien{
    ITinhTienDien bacKeTiep;
    int max, min;
    float Gia;

    public TinhTienDien(int max, int min, float gia) {
        this.max = max;
        this.min = min;
        Gia = gia;
    }

    @Override
    public float TinhTien(float SoKwH) {
        if(SoKwH <= max)
            return (SoKwH-min)*Gia;
        else
            return (max-min)*Gia + bacKeTiep.TinhTien(SoKwH);

    }

    @Override
    public ITinhTienDien BacKeTiep(ITinhTienDien itinhTienDien) {
        this.bacKeTiep = itinhTienDien;
        return itinhTienDien;
    }
}
