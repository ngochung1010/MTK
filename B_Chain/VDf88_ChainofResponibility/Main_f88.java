package B_Chain.VDf88_ChainofResponibility;

public class Main_f88 {
    public static void main(String[] args) {
        IXuLyVay NV1 = new NhanVienF88("Minh", "Nhân Viên 1", 150);
        IXuLyVay NV2 = new NhanVienF88("Thảo", "Nhân viên 2", 200);
        IXuLyVay NV3 = new NhanVienF88("thuận", "Nhân Viên 3", 300);
        IXuLyVay GiamDoc = new GiamDocF88("Hùng", 500);
        NV1.capCaoHon(NV2)
                .capCaoHon(NV3)
                .capCaoHon(GiamDoc);
        System.out.println(NV1.XuLyKhoanVay(510));
    }
}
