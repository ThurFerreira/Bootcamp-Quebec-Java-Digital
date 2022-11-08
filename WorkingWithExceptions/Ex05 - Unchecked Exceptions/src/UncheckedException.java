import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean repeat = true;
        int resultado = 0;

        do{
            //está fora do try pois as exceptions podem acontecer na hora da divisão, e não da leitura
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                repeat = false;
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro! insira um valor numérico válido.");
                //e.printStackTrace();
            }catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Erro! insira um valor válido para o denominador.");
            }
        }while(repeat);
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}
