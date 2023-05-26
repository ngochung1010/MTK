package BT4;


public class ChuyenXeNoiThanh extends ChuyenXe{
    //số tuyến, số km đi được, doanh thu.
    String SoTuyen;
    int soKM;

    public ChuyenXeNoiThanh(String SoTuyen, int soKM, String maSoChuyen, String taixe, String soXe, int doanhthu) {
        super(maSoChuyen, taixe, soXe, doanhthu);
        this.SoTuyen = SoTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh"
                + "{" + 
                "MaSoChuyen: '" + maSoChuyen + '\n' +
                "HoTenTaiXe: '"+ taixe + '\n' +
                "SoXe: '" + soXe + '\n' +
                "SoTuyen: '" + SoTuyen + '\n' + 
                "DoanhThu: '" + doanhthu + '\n' +
                ", soKM: " + soKM + '}';
    }
}
