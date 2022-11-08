import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int resultado = 0;
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

                try {      

                    if(numerador[i] % 2 != 0) 
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                    resultado = numerador[i] / denominador[i];

                } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }


            System.out.println(resultado);
        }

    }
}

