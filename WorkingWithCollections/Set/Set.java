package WorkingWithCollections.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        //HashSet<Double> notas = new HashSet<>();
        //notas.add(1d);
        //notas.remove(1d);

        double next, soma = 0;

        //organiza em ordem aleatória
        HashSet<Double> notas = new HashSet<>(Arrays.asList(0.0,7d,8.5,9.3,5d,7d,8d,3.6));
        
        Iterator<Double> iterator = notas.iterator();
        
        System.out.println(notas.toString());
    
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        System.out.printf("Exiba a soma dos valores: ");

        while(iterator.hasNext()){
            //somando os valores de cada proximo valor do iterator
            soma += iterator.next();
        }

        System.out.printf("%.1f\n", soma);

        System.out.printf("Exiba a media das notas: %.2f\n", (soma/(notas.size())));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0.0);

        System.out.println(notas);

        System.out.println("remova as notas menores que 7.0 e exiba a lista: " );

        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            next = iterator1.next();

            if(next < 8){
                iterator1.remove();
            }
        }
        
        System.out.println(notas.toString());

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");

        //organiza de acordo com a ordem de inserção
        LinkedHashSet<Double> notas2 = new LinkedHashSet<>();
        notas2.add(8.0);
        notas2.add(7d);
        notas2.add(6d);
        notas2.add(8d);
        notas2.add(3d);
        notas2.add(2d);
        notas2.add(0d);

        System.out.println(notas2.toString());


        System.out.println("Exiba todas as notas em ordem crescente: ");

        TreeSet<Double> notas3 = new TreeSet<>(notas2); //notas2 só pode ser passado como argumento porque tem o método comparator (Do double) implementado

        System.out.println(notas3);

        System.out.println("Apague todo o conjunto notas1: ");
        notas.clear();

        System.out.println("notas1 está vazio? " + notas.isEmpty());
        
    }
}