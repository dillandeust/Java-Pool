import java.util.ArrayList;
import java.util.List;

abstract class Sandwich implements Food {
    protected float price;
    protected int calories;
    protected boolean vegetarian=false;
    List<String> ingredients =new ArrayList<>();

    protected Sandwich(float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
