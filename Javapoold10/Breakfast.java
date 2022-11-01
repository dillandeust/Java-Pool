public class Breakfast<T extends Drink, A extends Bread> extends Menu<Drink, Bread>{
    
    public Breakfast(T drink, A bread){
        super(drink, bread);
    }
}
