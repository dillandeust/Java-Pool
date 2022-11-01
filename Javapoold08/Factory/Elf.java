package Factory;

import java.util.List;

public class Elf {
    
    private Toy toy = null;
    private List<GiftPaper> papers;
    private Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
    }

    public boolean pickToy(String toyName) throws NoSuchToyException {
        if (toy != null) {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        } else {
            switch(toyName){
                case "teddy": 
                case "gameboy":
                toy = factory.create(toyName);
                System.out.println("What a nice one! I would have liked to keep it...");
                return true;
                default:
                System.out.println("I didn't find any " + toyName+".");
                return false;
            }
        }
    }

    public boolean pickPapers(int n) {
        papers = factory.getPapers(n);
        return true;
    }

    public GiftPaper pack() {
       
       for (int i=0; i< papers.size(); i++){
        if(toy != null && papers.get(i).getGift() == null){
            papers.get(i).wrap(toy);
            System.out.println("And another kid will be happy!");
            toy= null;
            return papers.get(i);
        }
        if(toy==null && papers.get(i).getGift() == null){
            System.out.println("I don't have any toy, but hey at least it's paper!");
            return papers.get(i);
        }
       } 
       System.out.println("Wait... I can't pack it with my shirt.");
        return null;
    }
}
