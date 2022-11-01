public class Gecko {
    String food;
    int energy = 100;

    private int age;

    private String name;
    {
        if (name == null) {
            name = "Unknown";
        }
    }

    public Gecko() {
        System.out.println("Hello!");
    }

    public Gecko(String Name) {
        System.out.println("Hello " + Name + "!");
        name = Name;
    }

    public Gecko(String Name, int Age) {
        System.out.println("Hello " + Name + "!");
        name = Name;
        age = Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int newAge) {
        age = newAge;
        return age;
    }

    public void status() {
        switch (getAge()) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");

        }
    }

    public void hello(String str) {
        if (str == null) {
            System.out.println("Hello, I'm " + name + "!");
        } else {
            System.out.println("Hello " + str + ", I'm " + name +"!");
        }
    }

    public void hello(int nbr) {
        for (int i = 0; i < nbr; i++) {
            System.out.println("Hello, I'm " + name + "!");
        }
    }

    public void eat(String feedwith) {
        food = feedwith.toLowerCase();
        switch (food.toLowerCase()) {
            case "meat":
                System.out.println("Yummy!");
                energy += 10;
                break;
            case "vegetable":
                System.out.println("Erk!");
                energy -= 10;
                break;
            default:
                System.out.println("I can't eat this!");
        }
        if (energy < 0) {
            energy = 0;
        }
        if (energy > 100) {
            energy = 100;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        energy= newEnergy;
        if (energy < 0) {
            energy = 0;
        }
        if (energy > 100) {
            energy = 100;
        }
    }

    public static void main(String[] args) {
        Gecko mimi = new Gecko("mimi");
        mimi.eat("Titi");
        mimi.setEnergy(5);
        mimi.eat("vegetable");
        //mimi.eat("Meat");
        
        System.out.println(mimi.getEnergy());
    }
}