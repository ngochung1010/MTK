package Template_Methods.D1_HoaDon;

import java.util.ArrayList;
import java.util.List;

public class MatHang {
    List<MatHang> dsMH = new ArrayList<>();
    String Ten;
    float Gia;
    int SoLuong;

    public MatHang(String ten, float gia, int soLuong) {
        Ten = ten;
        Gia = gia;
        SoLuong = soLuong;
    }

    public String getTen() {
        return Ten;
    }

    public Float getGia() {
        return Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setGia(Float gia) {
        Gia = gia;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                ", Ten='" + Ten + '\'' +
                ", Gia=" + Gia +
                ", SoLuong=" + SoLuong +
                '}';
    }
    float getThanhTien(){
        return SoLuong*Gia;
    }
}
