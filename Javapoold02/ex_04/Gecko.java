public class Gecko {

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

    public static void main(String[] args) {
        Gecko arthur = new Gecko("Arthur", 11);
        // arthur.setAge(11);
        System.out.println(arthur.getAge());
        arthur.status();
        Gecko benjy = new Gecko();
        benjy.setAge(10);
        benjy.status();
        System.out.println(arthur.getName());
        System.out.println(benjy.getName());
    }
}