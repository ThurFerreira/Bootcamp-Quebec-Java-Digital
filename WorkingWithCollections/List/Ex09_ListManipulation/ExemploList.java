package WorkingWithCollections.List.Ex09_ListManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double next = 0, soma = 0.0;

        // criando a lista
        //List<Double> notas = new ArrayList<Double>();

        //inicializar list com valores
        //List<Double> notas = new ArrayList<Double>(Arrays.asList("Valores que vão ser inseridos"));

        //inicializando uma list imutável (não se pode adicionar nem remover itens)
        //List<Double> notas = List.of("Valores da lista imutável");

        System.out.println(("Crie uma lista e adicione sete notas: "));
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d); //7d e 7.0 representa o valor 7 no tipo double
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(7.3);

        //impressão da lista
        //System.out.println(notas);
        //System.out.println(notas.toString());

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0");
        System.out.println(notas.indexOf(5d)); //argumento é referente a nota buscada, o método index0f irá retornar a posição que o argumento se encontra
    
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: ");
        //notas.contains(5.0); //retorna true ou false
        System.out.println("A nota 5.0 está na lista? " + notas.contains(5.0));

        System.out.println("Exiba as notas na ordem em que foram informadas: ");
        //com o uso do list, os elementos adicionados mantém a ordem de inserção
        
        for(Double nota : notas){ //uso do foreach para imprimir cada nota da lista
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); 

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); 

        System.out.println("Exiba a soma dos valores: ");
        
        //somando valores usando a interface Iterator
        Iterator<Double> Iterator = notas.iterator();
        
        while(Iterator.hasNext()){
            next = Iterator.next();
            soma += next;
        }

        System.out.println("soma = " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size())); //.size retorna a quantidade de elementos que tem dentro da list

        System.out.println("Remova a nota 0.0");
        notas.remove(0.0); //passando um inteiro ele remove da posição 0, passando o double remove o valor 0 de qualquer posição que seja

        System.out.println("Remova a nota na posição 0");
        notas.remove(0);

        System.out.println("Remova as notas menores que 7");
        
        Iterator<Double> Iterator1 = notas.iterator();

        while(Iterator1.hasNext()){
            next = Iterator1.next();
            if(next < 7){
                Iterator1.remove();
            }
        }

        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();

        System.out.println("A lista está vazia? " + notas.isEmpty()); // isEmpty retorna true se a lista está vazia
    }
}
