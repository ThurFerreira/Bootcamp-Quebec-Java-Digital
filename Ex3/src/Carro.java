public class Carro {
    
    int capacidadeTanque;
    String modelo;
    String cor;

    //CONSTRUTOR
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){  //o "this."" se refere ao atributo global da classe"
       this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //GET
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    //SET
    public void setCapacidadeTanque(int capacidadeTanque) { //o "this." se refere ao atributo global da classe
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public void setCor(String cor){ //o retorno é void pois ele apenas quarda o valor solicitado
        this.cor = cor;
    }

    public void setModelo(String modelo){ 
        this.modelo = modelo;
    }

    public double calculaEncherTanque(double valorGasolina){
        
        double valor;

        valor = capacidadeTanque * valorGasolina;

        return valor;
    }

}
