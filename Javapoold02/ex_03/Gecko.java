public class Gecko {

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

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Gecko arthur = new Gecko("Arthur");
        Gecko benjy = new Gecko();
        System.out.println(arthur.getName());
        System.out.println(benjy.getName());
    }
}