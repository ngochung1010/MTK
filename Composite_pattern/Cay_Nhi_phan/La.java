package Composite_pattern.Cay_Nhi_phan;

public class La implements CayNhiPhan {
    private final String giaTri;


    public La(String giaTri) {
        this.giaTri = giaTri;
    }

    @Override
    public void duyetCay() {
        System.out.println(giaTri);
    }
}

