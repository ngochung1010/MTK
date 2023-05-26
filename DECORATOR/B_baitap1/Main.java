package DECORATOR.B_baitap1;

public class Main {
    public static void main(String[] args) {

        BieuThuc bt = new BieuThucDonGian(1);
                bt = new Cong(bt, 1);
                bt = new Chia(bt, 2);
                bt = new Nhan(bt, 1);
                bt = new Cong(bt, 8);
                bt = new Tru(bt, 10);
                bt  = new GTTD(bt);


                System.out.println(bt.bieuThuc() + "=" + bt.giaTri());
    }
}
