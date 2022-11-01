

public class Astronaut {
    int snacks;
    String destination;
    String name;
    private static int myid =0;
    private int id;

    public Astronaut(String Name){
        id=myid++;
        name= Name;
        System.out.println( name + " ready for launch!");
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSnacks(){
        return snacks;
    }

    public String getDestination(){
        return destination;
    }

    public static void main(String[] args) {
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        System.out.println(mutta.getId());
        System.out.println(hibito.getId());
    }
}