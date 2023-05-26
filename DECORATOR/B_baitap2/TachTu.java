package DECORATOR.B_baitap2;

import java.util.List;

public class TachTu extends Tokenize{
    String chuoi;

    public TachTu(List<String> tachtu, String chuoi) {
        super(tachtu);
        this.chuoi = chuoi;
    }

    public TachTu(List<String> tachtu) {
        super(tachtu);
    }
}
