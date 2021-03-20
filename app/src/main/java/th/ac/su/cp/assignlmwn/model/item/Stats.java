package th.ac.su.cp.assignlmwn.model.item;

import com.google.gson.annotations.SerializedName;

public class Stats {
    @SerializedName("total")
    private Integer total;
    @SerializedName("offset")
    private Integer offset;
    @SerializedName("limit")
    private Integer limit;
    @SerializedName("order")
    private String order;
    @SerializedName("base")
    private String base;
    @SerializedName("totalMarkets")
    private Integer totalMarkets;
    @SerializedName("totalExchanges")
    private Integer totalExchanges;
    @SerializedName("totalMarketCap")
    private double totalMarketCap;
    @SerializedName("total24hVolume")
    private double total24hVolume;

    public Stats(Integer total, Integer offset, Integer limit, String order, String base, Integer totalMarkets, Integer totalExchanges, double totalMarketCap, double total24hVolume) {
        this.total = total;
        this.offset = offset;
        this.limit = limit;
        this.order = order;
        this.base = base;
        this.totalMarkets = totalMarkets;
        this.totalExchanges = totalExchanges;
        this.totalMarketCap = totalMarketCap;
        this.total24hVolume = total24hVolume;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getOrder() {
        return order;
    }

    public String getBase() {
        return base;
    }

    public Integer getTotalMarkets() {
        return totalMarkets;
    }

    public Integer getTotalExchanges() {
        return totalExchanges;
    }

    public double getTotalMarketCap() {
        return totalMarketCap;
    }

    public double getTotal24hVolume() {
        return total24hVolume;
    }
}
