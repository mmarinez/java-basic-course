package chapter9;

public class WeddingCake extends Cake{

    private int tiers;

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }
    public WeddingCake(String flavor) {
        super(flavor + " for the wedding cake");
    }
}
