package BT4;



public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String NoiDen;
    int SoNgayDiDuoc;

    public ChuyenXeNgoaiThanh(String NoiDen, int SoNgayDiDuoc, String maSoChuyen, String taixe, String soXe, int doanhthu) {
        super(maSoChuyen, taixe, soXe, doanhthu);
        this.NoiDen = NoiDen;
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" + 
                "MaSoChuyen: '" + maSoChuyen + '\n' +
                "HoTenTaiXe: '"+ taixe + '\n' +
                "SoXe: '" + soXe + '\n' +
                "NoiDen: '" + NoiDen + '\n' +
                "DoanhThu: '" + doanhthu + '\n' +
                ", SoNgayDiDuoc: " + SoNgayDiDuoc + '}';
    }
    
}
