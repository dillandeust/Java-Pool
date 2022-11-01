abstract class Bread implements Food {
    protected float price;
    protected int calories;
    protected int bakingTime=0;

    protected Bread(float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }
    
    public int getBakingTime() {
        return bakingTime;
    }
}
