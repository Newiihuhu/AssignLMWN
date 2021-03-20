package th.ac.su.cp.assignlmwn.model.item;

import com.google.gson.annotations.SerializedName;

import th.ac.su.cp.assignlmwn.model.item.Data;

public class Item {
    @SerializedName("status")
    private String status;
    @SerializedName("data")
    private Data data;

    public Item(String status, Data data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }
}
