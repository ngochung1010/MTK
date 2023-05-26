package B_Chain.VDf88_ChainofResponibility;

public class GiamDocF88 implements IXuLyVay{
    String ten;
    int hanMucChoVay;

    public GiamDocF88(String ten, int hanMucChoVay) {
        this.ten = ten;
        this.hanMucChoVay = hanMucChoVay;
    }

    @Override
    public String XuLyKhoanVay(int tienVay) {
        if (tienVay<=hanMucChoVay)
            return " Giám Đốc " + ten + " Xữ lý khoản vay ";
        return "không cho vay!!!";
    }

    @Override
    public IXuLyVay capCaoHon(IXuLyVay xuLyVay) {
        return null;
    }
}
