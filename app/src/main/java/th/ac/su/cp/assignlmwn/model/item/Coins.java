package th.ac.su.cp.assignlmwn.model.item;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Coins {
    @SerializedName("id")
    private Integer id;
    @SerializedName("uuid")
    private String uuid;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("color")
    private String color;
    @SerializedName("iconType")
    private String iconType;
    @SerializedName("iconUrl")
    private String iconUrl;
    @SerializedName("websiteUrl")
    private String websiteUrl;
    @SerializedName("socials")
    private List<Socials> socials;
    @SerializedName("links")
    private List<Socials> links;
    @SerializedName("confirmedSupply")
    private boolean confirmedSupply;
    @SerializedName("numberOfMarkets")
    private Integer numberOfMarkets;
    @SerializedName("numberOfExchanges")
    private Integer numberOfExchanges;
    @SerializedName("type")
    private String type;
    @SerializedName("volume")
    private Long volume;
    @SerializedName("marketCap")
    private Long marketCap;
    @SerializedName("price")
    private String price;
    @SerializedName("circulatingSupply")
    private String circulatingSupply;
    @SerializedName("totalSupply")
    private String totalSupply;
    @SerializedName("approvedSupply")
    private boolean approvedSupply;
    @SerializedName("firstSeen")
    private String firstSeen;
    @SerializedName("listedAt")
    private String listedAt;
    @SerializedName("change")
    private double change;
    @SerializedName("rank")
    private Integer rank;
    @SerializedName("history")
    private List<String> history;
    @SerializedName("allTimeHigh")
    private AllTimeHigh allTimeHigh;
    @SerializedName("penalty")
    private boolean penalty;

    public Integer getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String getIconType() {
        return iconType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public List<Socials> getSocials() {
        return socials;
    }

    public List<Socials> getLinks() {
        return links;
    }

    public boolean isConfirmedSupply() {
        return confirmedSupply;
    }

    public Integer getNumberOfMarkets() {
        return numberOfMarkets;
    }

    public Integer getNumberOfExchanges() {
        return numberOfExchanges;
    }

    public String getType() {
        return type;
    }

    public Long getVolume() {
        return volume;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public String getPrice() {
        return price;
    }

    public String getCirculatingSupply() {
        return circulatingSupply;
    }

    public String getTotalSupply() {
        return totalSupply;
    }

    public boolean isApprovedSupply() {
        return approvedSupply;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public String getListedAt() {
        return listedAt;
    }

    public double getChange() {
        return change;
    }

    public Integer getRank() {
        return rank;
    }

    public List<String> getHistory() {
        return history;
    }

    public AllTimeHigh getAllTimeHigh() {
        return allTimeHigh;
    }

    public boolean isPenalty() {
        return penalty;
    }
}
