package metodos;

//2- Método par o impar

public class Metodo2 {
    static boolean esPar(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
       if (esPar(100)){
           System.out.println("Es par");
       }else {
           System.out.println("Es impar");
       }
    }
}
