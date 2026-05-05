package objetos;

public class Calculator {

    private double resultado;

    //Constructor vacío
    public Calculator(){
        resultado = 0;
    }

    //Constructor con valor inicial
    public Calculator(double  valorInicial){
        resultado = valorInicial;
    }
    public double sumar(double a, double b){
        resultado = a+b;
        return resultado;
    }
    public double restar(double a, double b){
        resultado = a-b;
        return resultado;
    }
    public double multiplicar(double a ,double b){
        resultado = a*b;
        return resultado;
    }
    public double dividir (double a, double b){
        if (b != 0){
            resultado = a/b;
        }else{
            System.out.println("No se puede dividir entre 0");
            resultado = 0;
        }
        return resultado;
    }
    public double getResultado(){
        return resultado;
    }


}
