package B_Chain.DoVeSo;

public class GiaiThuong implements IDoVeSo{
    IDoVeSo DoKeTiep;

    String tenGiai;
    String boSo[];

    public GiaiThuong(IDoVeSo doKeTiep, String tenGiai, String[] boSo) {
        DoKeTiep = doKeTiep;
        this.tenGiai = tenGiai;
        this.boSo = boSo;
    }

    @Override
    public String SoVe(int SoDo) {
        return null;
    }

    @Override
    public IDoVeSo DoKeTiep(IDoVeSo iDoVeSo) {
        this.DoKeTiep = iDoVeSo;
        return iDoVeSo;
    }
}
