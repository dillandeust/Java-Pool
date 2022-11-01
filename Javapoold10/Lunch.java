public class Lunch<T extends Drink, A extends Sandwich> extends Menu<Drink, Sandwich> {
    public Lunch(T drink, A sandwich){
        super(drink, sandwich); 
    }
}
