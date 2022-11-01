
public class Mars {
    private static int myid=0;
    private int id;

    public Mars(){
        id=myid++;
    }

    public  int getId() {
        return id;
    }

    public static void main(String[] args) {
        Mars rocks = new Mars();
        Mars lite = new Mars();
        Mars snack = new Mars();
        Mars snck = new Mars();
        System.out.println(rocks.getId());
        System.out.println(lite.getId());
        System.out.println(snack.getId());
        System.out.println(snck.getId());
    }
}