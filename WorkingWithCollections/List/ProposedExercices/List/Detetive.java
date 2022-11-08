package WorkingWithCollections.List.ProposedExercices.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*

Usando listas, faça um programa que faça 5 perguntas para uma pessoa
sobre um crime. As perguntas são:

1. Telefonou para a vítima?
2. Exteve no local do crime?
3. Mora perto da Vitima?
4. Devia para a vítima?
5. Já trabalhou com a vítima?

Se a pessoa responder positivamente a 2 questões ela deve ser classificada
como "Suspeita, entre 3 e 4 como "Cúmplice" e 5 como "Culpado".
Caso contrário, ela será classificada como "Inocente".

 */

public class Detetive {

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String next;
    int yes = 0;

    List<String> answers = new ArrayList<>();
    
    System.out.println("Responda as 5 perguntas seguintes apenas com 'S' ou 'N'");

    System.out.println("Telefonou para a vítima?");
    answers.add(in.next().toUpperCase());

    System.out.println("Mora perto da Vitima?");
    answers.add(in.next().toUpperCase());

    System.out.println("Exteve no local do crime?");
    answers.add(in.next().toUpperCase());

    System.out.println("Devia para a vítima?");
    answers.add(in.next().toUpperCase());

    System.out.println("Já trabalhou com a vítima?");
    answers.add(in.next().toUpperCase());

    in.close();

    Iterator<String> iterator = answers.iterator();

    while(iterator.hasNext()){
        next = iterator.next();

        if(next == "S"){
            yes++;
        }
    }

    if(yes == 5){
        System.out.println("Culpado!");

    }else if(yes == 3 || yes == 4){
        System.out.println("Cúmplice!");

    }else if(yes == 2){
        System.out.println("Suspeita!");

    }else{
        System.out.println("Inocente!");
    }
   }
    
}
