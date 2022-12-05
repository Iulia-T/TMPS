package Laboratory2.Composite;

import java.util.ArrayList;
import java.util.List;

public class Delivery {

    private List<Pasta> pastaSet = new ArrayList<Pasta>();
    
    public void addPasta(Pasta pasta){
        pastaSet.add(pasta);
    }

    public void removePasta(Pasta pasta){
        pastaSet.remove(pasta);
    }

    public void createFamilySet(){
        System.out.println("Creating family set offer ...");
        for (Pasta pasta: pastaSet) {
            pasta.setPasta();
        }
    }
}
