public class GreatWhite extends Shark {
    
    private static boolean can = false;
    private static boolean frenzy = false;
    

    public GreatWhite(String name) {
        super(name);
        

    }
    
    @Override
    public void smellBlood(boolean fr) {
        frenzy = fr;
    }

    @Override
    public void status() {
        if (frenzy == true) {
            System.out.println(getName() + " is smellig blood and wants to kill.");
        } else {
            System.out.println(getName() + " is swimming peacefully.");
        }
    }

    
    @Override
    public boolean canEat(Animal animal) {
        
        if (animal.getClass().getName() == "Canary") {
            can = false;
        } else {
            can = true;
        }
        return can;
    }



    @Override
    public void eat(Animal animal) {
        
        if (frenzy == true) {
            if (canEat(animal) == true) {
                System.out.println(getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
                frenzy = false;
            } 
            if (canEat(animal) == false) {
                System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            }
            if ((animal instanceof Shark) == true){
                System.out.println(getName() + ": The best meal one could wish for.");
            }
        }
    }
}
