public class Mensagem {

    public static void Horario(int hora){
        if(hora >= 6 && hora <= 12){
            Mensagem.bomDia();
        }else if(hora > 12 && hora <= 18){
            Mensagem.boaTarde();
        }else{
            Mensagem.boaNoite();
        }
    }
    
    public static void bomDia(){
        System.out.println("Bom Dia");
    }

    public static void boaTarde(){
        System.out.println("Boa Tarde");

    }

    public static void boaNoite(){
        System.out.println("Boa Noite");

    }


}