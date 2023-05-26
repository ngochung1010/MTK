package Observer.A5_baitap5;

public class A5_Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk1 =  new TaiKhoan(atm, 200, "Thu");
        tk1.duaTheVao();
        atm.RutTien(50);
        atm.RutTien(100);
        atm.RutTien(100);
        tk1.layThe();
    }
}
