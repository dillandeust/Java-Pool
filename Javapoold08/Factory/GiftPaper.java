package Factory;

public class GiftPaper {
    private Toy gift;

    public void wrap(Toy gift) {
        if (gift != null){
            this.gift = gift;
        }
    }

    public Toy unwrap() {
        Toy first= gift;
        this.gift = null;
        return first;
    }

    public Toy getGift() {
        return gift;
    }
}