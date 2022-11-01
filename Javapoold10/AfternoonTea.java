public class AfternoonTea<T extends Drink, A extends Dessert> extends Menu<Drink, Dessert> {
    public AfternoonTea(T drink, A dessert){
        super(drink, dessert);
    }
}
