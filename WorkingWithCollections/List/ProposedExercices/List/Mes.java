package WorkingWithCollections.List.ProposedExercices.List;

public class Mes {
    
    String nome;
    double temperatura;

    Mes(){
        nome = null;
        this.temperatura = 0;
    }

    Mes(String nome, double temperatura){
        this.nome = nome;
        this.temperatura = temperatura;
    }

    public String getNome() {
        return nome;
    }

    public double getTemperatura() {
        return temperatura;
    }

    
}
