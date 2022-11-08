public class DivisaoNaoExataException extends Exception{

    private int numerador;
    private int denominador;

    DivisaoNaoExataException (String message, int numerado, int denominador) {
        super(message);
        this.numerador = numerado;
        this.denominador = denominador;
    }
}