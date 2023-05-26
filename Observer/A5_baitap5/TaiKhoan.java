package Observer.A5_baitap5;

public class TaiKhoan implements ATM.I_TaiKhoanATM{
    ATM atm;
    int soDu;
    String Ten;

    public TaiKhoan(ATM atm, int soDu, String ten) {
        this.atm = atm;
        this.soDu = soDu;
        Ten = ten;
    }

    public void duaTheVao()
    {
        atm.attach(this);
    }
    public void layThe()
    {
        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soTienRut < soDu)
            return true;
        else
            return false;
    }

    @Override
    public void NhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong)
        {
            soDu -= soTienRut;
            System.out.println(Ten + " Bạn đã thành công rút được: " + soTienRut + " | Số dư tài khoản: " + soDu);
        }
        else
            System.out.println(" Rút không thành công ");
    }
}
