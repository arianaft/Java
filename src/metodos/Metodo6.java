package metodos;

//6-Mayor de tres

public class Metodo6 {
    static int mayorDeTres(int a, int b, int c){
        if (a>=b && a>=c){
            return a;
        }else if (b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }


    public static void main(String[] args) {
        int valor = mayorDeTres(3,2,9);
        System.out.print("El mayor es  " + valor);
    }
}