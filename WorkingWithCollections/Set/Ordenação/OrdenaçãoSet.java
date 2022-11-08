package WorkingWithCollections.Set.Ordenação;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenaçãoSet {
    public static void main(String[] args) {
        
        System.out.println("Ordem aleatoria");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        
        System.out.println("Ordem de inserção");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries2) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    
        System.out.println("Ordem de natual (tempo de episodio)");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);

        for (Serie serie: minhasSeries3) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        
        System.out.println("Ordem de Nome/Genero/Tempo de Episodio");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries4.addAll(minhasSeries);

        for (Serie serie: minhasSeries4) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        
        
    }
}
