public class Calculadora {
    
    public static void area(double x, double y){
        double area = x * y;

        System.out.println("area do retangulo " + area);
    }

    public static void area(float x){
        float area = x * x  ;

        System.out.println("area do quadrado " + area);
    }

    public static void area(int x, int y, int z){
        int area = ((x+y)*z)/2;

        System.out.println("area do trapezio " + area);
    }
}