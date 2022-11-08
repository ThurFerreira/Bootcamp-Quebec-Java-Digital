package WorkingWithCollections.List.Ex10_ListSort;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {

        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
        // gato1 > gato2 = 1
        // gato1 = gato2 = 0
        // gato1 < gato2 = -1
    }
    
}
