public class Gecko {

    public String name;
    {
        if(name == null){
            name="Unknown";
        }
    }
    public Gecko(){
        System.out.println("Hello!");
    }
    
    public Gecko(String Name) {
        System.out.println("Hello " + Name+ "!");
        name= Name;
    }

    public static void main ( String [] args ) {
        Gecko arthur = new Gecko ("Arthur") ;
        Gecko benjy = new Gecko () ;
        System.out.println ( arthur.name ) ;
        System.out.println ( benjy.name ) ;
        }
    }