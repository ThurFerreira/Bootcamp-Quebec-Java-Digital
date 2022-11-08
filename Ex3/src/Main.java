//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //Carro carro = new Carro();
        Carro carro2 = new Carro();

        // int capacidadeTanque = 0;
        // String modelo = "";
        // String cor = "";
        double valorTanque;

        // try (Scanner entrada = new Scanner(System.in)) {
        //     System.out.println("Digite o modelo do carro");
        //     modelo = entrada.nextLine();

        //     System.out.println("Digite a cor do carro");
        //     cor = entrada.nextLine();

        //     System.out.println("Digite a capacidade do tanque do carro");
        //     capacidadeTanque = entrada.nextInt();
        // }

        // carro.setCapacidadeTanque(capacidadeTanque);
        // carro.setModelo(modelo);
        // carro.setCor(cor);

        carro2.setCapacidadeTanque(440);
        carro2.setCor("prata");
        carro2.setModelo("prisma");
        
        System.out.println("modelo do carro 2: " + carro2.getModelo());
        System.out.println("Capacidade do tanque do carro 2: " + carro2.getCapacidadeTanque());
        System.out.println("cor do carro 2: " + carro2.getCor());

        valorTanque = carro2.calculaEncherTanque(5.55);
        System.out.println("Valor para encher o tanque do carro: " + valorTanque + " Litros");
        
    }
}
