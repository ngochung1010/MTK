package DECORATOR.B_baitap2;

import java.util.List;

public class TokenizeDecorator extends Tokenize{
    Tokenize tokenize;

    public TokenizeDecorator(List<String> tachtu, Tokenize tokenize) {
        super(tachtu);
        this.tokenize = tokenize;
    }

    public TokenizeDecorator(List<String> tachtu) {
        super(tachtu);
    }
}
