package Composite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements Sentence{
    private List<Sentence> childSentence = new ArrayList<Sentence>();

    
    public void print() {
        for (int i=0; i<childSentence.size(); i++){
            childSentence.get(i).print();
        }
    }

    public void add(Sentence sentence){
        childSentence.add(sentence);
    }

    public void remove(Sentence sentence){
        childSentence.remove(sentence);
   }
}
