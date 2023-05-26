package B_Chain.B2_TienDien;

public class Main_TienDien {
    public static void main(String[] args) {
        ITinhTienDien soKwH1 = new TinhTienDien(50, 0, 1.678f);
        ITinhTienDien soKwH2 = new TinhTienDien(100, 51, 1.734f);
        ITinhTienDien soKwH3 = new TinhTienDien(200, 101, 2.014f);
        ITinhTienDien soKwH4 = new TinhTienDien(300, 201, 2.536f);
        ITinhTienDien soKwH5 = new TinhTienDien(400, 301, 2.834f);
        ITinhTienDien soKwH6 = new TinhTienDien(500, 401, 2.927f);
        soKwH1.BacKeTiep(soKwH2)
                .BacKeTiep(soKwH3)
                .BacKeTiep(soKwH4)
                .BacKeTiep(soKwH5)
                .BacKeTiep(soKwH6);
        System.out.println("so tien: " + soKwH1.TinhTien(150));
    }
}
