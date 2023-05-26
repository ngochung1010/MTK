package Template_Methods.D2_LopHoc;

public class MonHoc {
    int maMH, soTC;
    String tenMH;

    public MonHoc(int maMH, int soTC, String tenMH) {
        this.maMH = maMH;
        this.soTC = soTC;
        this.tenMH = tenMH;
    }

    public int getMaMH() {
        return maMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMH=" + maMH +
                ", soTC=" + soTC +
                ", tenMH='" + tenMH + '\'' +
                '}';
    }
}
