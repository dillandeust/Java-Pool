import java.util.ArrayList;

public class Ex05 {
    
    public static ArrayList < String > myGetArgs ( String ... var ){
        ArrayList<String> myGetArgs = new ArrayList<String>();
        for (String i : var){
        myGetArgs.add(i);
       }
       return myGetArgs;
    }
    
    public static void main(String[] args) {

        System.out.println(myGetArgs ("dillan", "lise", "pogba", "hamad", "pascal"));
    }
}
