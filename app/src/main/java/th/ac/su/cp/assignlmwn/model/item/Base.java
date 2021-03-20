package th.ac.su.cp.assignlmwn.model.item;

import com.google.gson.annotations.SerializedName;

public class Base {
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("sign")
    private String sign;

    public Base(String symbol, String sign) {
        this.symbol = symbol;
        this.sign = sign;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSign() {
        return sign;
    }
}
