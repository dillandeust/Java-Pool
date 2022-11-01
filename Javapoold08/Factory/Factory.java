package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public Toy create(String toy) throws NoSuchToyException {
        switch (toy.toLowerCase()) {
            case "teddy":
                return new TeddyBear();
            case "gameboy":
                return new Gameboy();
            default:
                throw new NoSuchToyException("No such toy: " + toy+".");
        }
    }

    public List<GiftPaper> getPapers(int n) {
        ArrayList<GiftPaper> list = new ArrayList<GiftPaper>();
        for (int i = 0; i < n; i++) {
            list.add(new GiftPaper());
        }
        return list;
    }
}
