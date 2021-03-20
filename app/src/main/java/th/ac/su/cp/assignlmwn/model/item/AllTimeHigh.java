package th.ac.su.cp.assignlmwn.model.item;

import com.google.gson.annotations.SerializedName;

public class AllTimeHigh {
    @SerializedName("price")
    private String price;
    @SerializedName("timestamp")
    private String timestamp;

    public String getPrice() {
        return price;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
