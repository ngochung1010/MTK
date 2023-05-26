package bt3;

public abstract class SinhVienPoly {
    String hoten, nganh;
    //phương thức khởi tạo
    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    
    // khai báo phương thức triều tượng
    public abstract double getdiem();
    //phương thức xuat() in họ tên và ngành học của sinh viên ra màn hình.
    public void xuat(){
        System.out.println("Ho Ten: "+hoten);
        System.out.println("Nganh Hoc: "+nganh);
    }
    //get set của phương thức hoten&nganh.
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    //phương thức set nằm sau cùng.
    public String getHoten() {
        return hoten;
    }

    public String getNganh() {
        return nganh;
    }
    
    
}
