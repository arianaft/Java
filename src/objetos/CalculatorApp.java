package objetos;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Resultado: " + calc.getResultado());

        Calculator calc1 = new Calculator(50);
        System.out.println(calc1.getResultado());

        calc.sumar(10,5);
        System.out.println(calc.getResultado());
    }
}
