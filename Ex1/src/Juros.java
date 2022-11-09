public class Juros {
    public static void CalculaJuros(int valor){
        double valorFinal = valor + (0.8 * valor);

        //System.out.println("Com esse valor, voce terá " + valorFinal + " por mes");
        System.out.format("%.2f\n", valorFinal);
    }
}
