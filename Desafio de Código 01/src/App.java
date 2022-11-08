import java.util.Scanner;

public class App {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 

    leitor.close();
    
        int vet[]  =  new int[1000];;

        for(int i = 1; i < vet.length; i++){
          i--;
          for(int j = 0; j < t; j++){
            vet[i] = j;
            i++;
          }
        }

        for(int i = 0; i < vet.length; i++){
          System.out.printf("N[%d] = %d\n", i, vet[i]);
        }
    }
}
