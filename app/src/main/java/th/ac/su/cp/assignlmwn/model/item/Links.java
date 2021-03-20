package th.ac.su.cp.assignlmwn.model.item;

import com.google.gson.annotations.SerializedName;

public class Links {
    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("type")
    private String type;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }
}
