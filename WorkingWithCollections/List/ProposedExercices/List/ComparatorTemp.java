package WorkingWithCollections.List.ProposedExercices.List;

import java.util.Comparator;

public class ComparatorTemp implements Comparator<Mes>{

    @Override
    public int compare(Mes mes1, Mes mes2) {
       
        return Double.compare(mes1.getTemperatura(), mes2.getTemperatura());
    }
    
}
