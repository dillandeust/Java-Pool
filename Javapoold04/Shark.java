public class Shark extends Animal {
    private static boolean frenzy = false;
    private static boolean can = false;

    public Shark(String name) {
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");

    }

    public void smellBlood(boolean fr) {
        frenzy = fr;
    }

    public void status() {
        if (frenzy == true) {
            System.out.println(getName() + " is smellig blood and wants to kill.");
        } else {
            System.out.println(getName() + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animal) {

        if (animal.getClass().toString() == "Shark") {
            can=false;
        } else {
            can=true;
        }
        return can;
    }

    public void eat(Animal animal) {
        if (frenzy == true) {
            if (canEat(animal) == true) {
                System.out.println(getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
                frenzy = false;
            } else {
                System.out.println(getName() + ": It's not worth my time.");
            }
        }
    }
}
