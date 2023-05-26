package bt3;

public class SinhVienIT extends SinhVienPoly{
    double diemjava, diemcss, diemHtml;

    public SinhVienIT(Double diemjava, Double diemcss, Double diemHtml, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getdiem() {
        return (2*diemjava + diemHtml + diemcss)/4;
    }
    
    
    
    
}
