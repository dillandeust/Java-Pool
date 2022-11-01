
public class Animal {

    private String name;
    private int legs;
    private Type type;
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected enum Type {
        MAMMAL,
        FISH,
        BIRD;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        numberOfAnimals++;

        switch (type.toString().toLowerCase()) {

            case "mammal":
                numberOfMammals++;
                break;

            case "bird":
                numberOfBirds++;
                break;

            case "fish":
                numberOfFish++;
                break;
        }

        System.out.println("My name is " + name + " and I am a " + type + "!");

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getLegs() {
        return legs;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public static int getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        if (numberOfMammals == 1) {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        return numberOfMammals;

    }

    public static int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish;

    }

    public static int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;

    }

    public static void main(String[] args) {
        Animal isidore = new Animal (" Isidore ", 4 , Animal.Type.FISH ) ;
        BlueShark didi = new BlueShark("didi"); 
        Canary d = new Canary("d"); 
        GreatWhite did = new GreatWhite("did"); 
        didi.smellBlood(true);
        didi.status();
        didi.canEat(isidore);
        didi.eat(isidore);
       
    }

}

