abstract class Menu <T extends Food, A extends Food> {
    T drink;
    A meal;

    public Menu(T drink, A meal){
        this.drink=drink;
        this.meal=meal;
    }

    public T getDrink() {
        return drink;
    }

    public A getMeal() {
        return meal;
    }

    float getPrice(){
        float price= drink.getPrice()+meal.getPrice();
        float finaPrice = price - (price*0.1f);
        return finaPrice;
    }
}
