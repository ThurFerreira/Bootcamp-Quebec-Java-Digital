package WorkingWithCollections.List.Ex10_ListSort;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
        // gato1 > gato2 = 1
        // gato1 = gato2 = 0
        // gato1 < gato2 = -1
    }
    
}
