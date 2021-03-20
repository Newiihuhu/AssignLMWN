package th.ac.su.cp.assignlmwn.model.item;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("stats")
    private Stats stats;
    @SerializedName("base")
    private Base base;
    @SerializedName("coins")
    private List<Coins> coins;

    public Data(Stats stats, Base base, List<Coins> coins) {
        this.stats = stats;
        this.base = base;
        this.coins = coins;
    }

    public Stats getStats() {
        return stats;
    }

    public Base getBase() {
        return base;
    }

    public List<Coins> getCoins() {
        return coins;
    }
}
