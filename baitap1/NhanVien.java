package baitap1;

public class NhanVien {
    //khởi tạo không tham số
    String name, diachi;
    int tuoi, tonggiolam;
    double tienluong;
    
    //khởi tạo có tham số
    public NhanVien(String name, String diachi, int tuoi, int tonggiolam, double tienluong) {
        this.name = name;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.tonggiolam = tonggiolam;
        this.tienluong = tienluong;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTonggiolam() {
        return tonggiolam;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTonggiolam(int tonggiolam) {
        this.tonggiolam = tonggiolam;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }
    
    public  String getThongTin(){
        return "NhanVien{" + " Ten: " + name + ", DiaChi: " + diachi + ", Tuoi: " + tuoi + ", TongGioLam: " + tonggiolam + ", TienLuong: " + tinhthuong() + '}';
    }

    public double tinhthuong(){
        if(tonggiolam >= 200)
        {
            return tienluong + tienluong * 0.2;
        }else if(tonggiolam < 200)
        {
            return tienluong + tienluong * 0.1;
        }else{
            return tienluong;
        }
    }
    
    
}
