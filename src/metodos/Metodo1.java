package metodos;

//1- Método suma

public class Metodo1 {
    static int sumar(int a,  int b){
        return a + b;
    }
    public static void main(String[] args) {
        int resultado = sumar(5,3);
        System.out.println("Resultado: " + resultado);
    }
}
