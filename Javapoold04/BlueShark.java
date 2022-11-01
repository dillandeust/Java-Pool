public class BlueShark extends Shark {

    private static boolean can = false;

    public BlueShark(String name) {
        super(name);

    }

   
    
    @Override
    public boolean canEat(Animal animal) {
        
        if (animal.getType().toString().equals("fish")) {
            can = true;
        } else {
            can = false;
        }
        return can;
    }
}
