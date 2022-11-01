abstract class Dessert implements Food {
    protected float price;
    protected int calories;

    protected Dessert(float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }
}
