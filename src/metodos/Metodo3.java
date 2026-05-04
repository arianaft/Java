package metodos;

//3- Método mayor de dos

public class Metodo3 {
    static int mayor(int a, int b){
        if (a >b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        int resultado = mayor(8,9);
        System.out.println("El mayor es " +resultado);
    }
}
