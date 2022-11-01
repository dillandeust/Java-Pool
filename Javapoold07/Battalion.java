import java.util.List;
import java.util.ArrayList;

public class Battalion {
    List<Character> characters = new ArrayList<>();

    public Battalion() {

    }

    void add(List<? extends Character> characters) {

        this.characters.addAll(characters);
    }

    void display() {
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i).getName());
        }
    }

    boolean fight() {
       
        if (this.characters.size() >= 2) {
            Character first = this.characters.get(0);
            Character second = this.characters.get(1);
            if (first.compareTo(second) < 0) {
                this.characters.remove(0);
                return true;
            } else if (first.compareTo(second) > 0) {
                this.characters.remove(1);
                return true;
            } else {
                this.characters.remove(1);
                this.characters.remove(0);
                return true;
            }
        } else {
            return false;
        }

    }
}
