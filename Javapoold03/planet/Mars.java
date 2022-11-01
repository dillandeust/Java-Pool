package planet;


public class Mars {
    private String landingSite;
    private static int myid=0;
    private int id;

    public Mars(String name){
        id=myid++;
        landingSite=name;
    }

    public  int getId() {
        return id;
    }

    public String getLandingSite(){
        return landingSite;
    }

    public static void main(String[] args) {
        
    }
}