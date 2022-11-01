abstract class Drink implements Food{
    protected float price;
    protected int calories;
    protected boolean aCan=false;

    protected Drink(float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isACan() {
        return aCan;
    }
}
