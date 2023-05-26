package Observer.A5_baitap5;

public class ATM {

    I_TaiKhoanATM i_taiKhoanATM;

    public void attach(I_TaiKhoanATM i_taiKhoanATM) {
        if (this.i_taiKhoanATM == null)
            this.i_taiKhoanATM = i_taiKhoanATM;
    }

    public void detach(I_TaiKhoanATM i_taiKhoanATM)
    {
        i_taiKhoanATM = null;
    }

    private boolean kiemTraTienRut(int soTienRut)
    {
        return i_taiKhoanATM.kiemTraSoDu(soTienRut);
    }

    public void RutTien(int soTienRut)
    {
        if(i_taiKhoanATM != null)
        {
            if(i_taiKhoanATM.kiemTraSoDu(soTienRut) == true)
                i_taiKhoanATM.NhanThongBao(soTienRut, true);
            else
                i_taiKhoanATM.NhanThongBao(soTienRut, false);
        }
        else
        {
            System.out.println("Bạn cần bỏ thẻ vào!!!");
        }
    }

    public static interface I_TaiKhoanATM{
        boolean kiemTraSoDu(int soTienRut);
        void NhanThongBao(int soTienRut, boolean thanhCong);
    }
}
