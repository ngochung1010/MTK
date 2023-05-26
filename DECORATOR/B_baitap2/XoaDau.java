package DECORATOR.B_baitap2;

import java.util.List;

public class XoaDau extends TokenizeDecorator{

    public XoaDau(List<String> tachtu, Tokenize tokenize) {
        super(tachtu, tokenize);
    }

    public XoaDau(List<String> tachtu) {
        super(tachtu);
    }
}
