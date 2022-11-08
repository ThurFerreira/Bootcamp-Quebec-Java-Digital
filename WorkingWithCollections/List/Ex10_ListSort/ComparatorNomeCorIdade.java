package WorkingWithCollections.List.Ex10_ListSort;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        
        int nome;
        int cor;

        nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());

        //se os nomes foram diferentes, então serão ordenados pelo nome
        if(nome != 0){
            return nome;
        }

        cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());

        //se os nomes foram iguais e as cores forem diferentes, então serão ordenados pela cor
        if(cor != 0){
            return cor;
        }

        //se os nomes e as cores forem iguais, então serão ordenados pela idade
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
    
}

