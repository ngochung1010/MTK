package bt3;

public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing, diemSale;
    //phương thức khởi tạo
    public SinhVienBiz(double diemMarketing, double diemSale, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    
    //Sinhvienbiz gồm các thuộc tính diemmarketing, diemsale. 
        //Ghi đè phương thức getdiem() để tính điểm cho sinh viên biz theo công thức (2*diemMarketing + diemSale)/3;
    @Override
    public double getdiem() {
        return (2*diemMarketing + diemSale)/3;
    }
    
    public String getHocLuc(){
        double diem = getdiem();
        if(diem < 5){
            return "yếu";
        }else if(diem <=6.5){
            return "trung bình";
        }else if(diem <= 7.5){
            return "khá";
        }else if(diem < 9){
            return "giỏi";
        }else{
            return "xuất sắc";
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Điểm: "+getdiem());
        System.out.println("Học Lực: "+getHocLuc());
    }
    
    
}
