package WorkingWithCollections.List.ProposedExercices.List;

/*

 Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
 e armazene-as em uma lista.
 Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas
 acima desta média, e em que mês elas ocorres (mostrar por extenso: 1- Janieio
 , 2- Fevereiro, e etc.).
 
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temperatura, cont = 1;
        double media = 0,soma = 0;

        //criando a lista
        List<Mes> months = new ArrayList<>();

        System.out.println("==| Insira a temperatura dos 6 primeiros meses do ano |==");
       
        System.out.println("Janeiro:");
        temperatura = in.nextInt();
        Mes Janeiro = new Mes("janeiro", temperatura);
        months.add(Janeiro);

        System.out.println("Fevereiro:");
        temperatura = in.nextInt();
        Mes Fevereiro = new Mes("fevereiro", temperatura);
        months.add(Fevereiro);

        System.out.println("Março:");
        temperatura = in.nextInt();
        Mes Marco = new Mes("marco", temperatura);
        months.add(Marco);

        System.out.println("Abril:");
        temperatura = in.nextInt();
        Mes Abril = new Mes("abril", temperatura);
        months.add(Abril);

        System.out.println("Maio:");
        temperatura = in.nextInt();
        Mes Maio = new Mes("maio", temperatura);
        months.add(Maio);

        System.out.println("Junho:");
        temperatura = in.nextInt();
        Mes Junho = new Mes("junho", temperatura);
        months.add(Junho);

        in.close();

        for(int i = 0; i < months.size(); i++){
            soma += months.get(i).getTemperatura();
        }

        //Media.temperatura = (double)(soma/months.size());
        media = soma/months.size();

        //ordenando a lista de temperaturas
        months.sort(new ComparatorTemp());
        
        System.out.printf("\n ===| Exibindo temperaturas maiores que a média (%.1f)|=== \n", media);
        int i = 0;

       for(Mes m : months){
        
        if((months.get(i).getTemperatura()) > media){
            System.out.println(cont + " - " + m.getNome());
            cont++;
        }else{
            i++;
        }
       }
       
    }
}
