package metodos;

public class Metodo5 {

    static double calcular(double a, double b, String operacion) {

        switch (operacion) {
            case "suma":
                return a + b;

            case "resta":
                return a - b;

            case "multiplicacion":
                return a * b;

            case "division":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: división por 0");
                    return 0;
                }

            default:
                System.out.println("Operación no válida");
                return 0;
        }
    }

    public static void main(String[] args) {
        double resultado = calcular(8, 9, "suma");
        System.out.println("Resultado: " + resultado);
    }
}