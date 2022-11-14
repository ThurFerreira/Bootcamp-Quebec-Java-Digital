package WorkingWithCollections.StreamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
//import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa String: ");

        //com express]ao lambda
        randomNumbers.forEach(s -> System.out.println(s)); 
       // randomNumbers.forEach(System.out::println); 

        // randomNumbers.stream().forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s){
        //         System.out.println();
        //     }
        // });

        System.out.println("Pegue os 5 primeiros numeros e coloque em um Set: ");
        randomNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforma a lista de String em uma lista de numeros inteiros: ");

        //by reference method
        randomNumbers.stream()              //Stream<String>
            .map(Integer::parseInt)         //Stream<Integer>
            .collect(Collectors.toList())   //List<integer>
            .forEach(System.out::println);

        // List<Integer> collectList = randomNumbers.stream()
        //     .map(Integer::parseInt)         //Stream<Integer>
        //     .collect(Collectors.toList());   //List<integer>
        
//by lambda
        //randomNumbers.stream().map(s -> Integer.parseInt(s));
        
//by classe anonima
        // randomNumbers.stream().map(new Function<String, Integer>() {
        //     @Override
        //     public Integer apply(String t) {
        //         return Integer.parseInt(t);
        //     }
            
        System.out.println("Mostre os numeros pares: maiores que 2: ");

//com classe anonima
        // List<Integer> ListPares = randomNumbers.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer integer) {
        //         if(integer%2 == 0 && integer > 2)
        //             return true;
        //         else
        //             return false;
        //     }
            
        // }).collect(Collectors.toList());
        
//by lambda

        List<Integer> ListPares = randomNumbers.stream().map(Integer::parseInt).filter(integer -> (integer%2 == 0 && integer > 2)).collect(Collectors.toList());
        System.out.println(ListPares);

        System.out.println("Mostre a media dos numeros: ");

//by lambda
        randomNumbers.stream().mapToInt(s -> Integer.parseInt(s)).average().ifPresent(v -> System.out.println(v));
        
//by reference class
        //randomNumbers.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

//by classe anonima
        // randomNumbers.stream().mapToInt(new ToIntFunction<String>() {
        //     @Override
        //     public int applyAsInt(String value) {
        //         return Integer.parseInt(value);
        //     }
            
        // }).average().ifPresent(new DoubleConsumer() {
        //     @Override
        //     public void accept(double value) {
        //         System.out.println(value);
        //     }    
        // });

        System.out.println("Remova os valores impares: ");
        List<Integer> impares = randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());
//by anonymous class
    //     impares.removeIf(new Predicate<Integer>() {
    //         @Override
    //         public boolean test(Integer value) {
    //             if(value % 2 != 0)
    //                 return true;
    //             else
    //                 return false;
    //         }
            
    //     });

//by lambda
    impares.removeIf(value -> (value % 2 != 0));
    System.out.println(impares);
            
    }
}