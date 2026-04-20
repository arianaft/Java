import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicios if
        /*

        //1- Número positivo, negativo o cero
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero");
        int num =  sc.nextInt();

        if (num > 0){
            System.out.println("Numero positivo");
        } else if (num < 0) {
            System.out.println("Numero negativo");

        }else {
            System.out.println("El numero es 0");
        }



        //2- Número par o impar
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num = sc.nextInt();

        if (num % 2 ==0){
            System.out.println("Es un numero par");
        }else {
            System.out.println("Es un numero impar");
        }

        //3- Mayor de edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Todavía eres menor");
        }


        //4-Número mayor de dos
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int num = sc.nextInt();
        System.out.println("Dime otro numero");
        int num1 = sc.nextInt();

        if(num > num1){
            System.out.print("El mayor de los dos es " + num);
        }else{
            System.out.println("El mayor de los dos es " + num1);
        }

        //5-Mayor de tres números
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("El mayor es " + num1);
           } else if (num2 >= num1 && num2 >= num3){
                System.out.print("El mayor es " + num2);
        }else {
            System.out.println(num1 + " El mayor es  " + num3);
        }


        //6.Nota de estudiante
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota de 0  a 10");
        int nota = sc.nextInt();

        if ( nota <=4  ){
            System.out.println("Suspenso");
        } else if (<= 6) {
            System.out.println("Aprobado");
        } else if ( nota <= 8) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("SOBRESALIENTE");

        } else {
            System.out.println("Introduce una nota del 0 al 10 ");
        }


        //7- Calculadora simple
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();
        System.out.println("Dime la operacion que necesitas hacer (+,-,*,/)");
        String operacion = sc.next();


        switch(operacion){
            case "+":
                System.out.println("Resultado "+ (num1 +num2));
                break;
            case "-":
                System.out.println("Resultado "+ (num1 -num2));
                break;
            case "/":
                System.out.println("Resultado "+ (num1 /num2));
                break;
            case "*":
                System.out.println("Resultado "+ (num1 *num2));
                break;
            default:
                System.out.println("Operacion no valida");
        }

        //8- Día de la semana
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1-7");
        int numero = sc.nextInt();

        if (numero <1 || numero >7){
            System.out.println("Número invalido");
        }else {
            switch (numero) {
                case 1:
                    System.out.print("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;

            }
        }

        //9- Año bisiesto
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }



        //10- Sistema de login simple
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el usuario");
        String usuario = sc.next();
        System.out.println("Introduce contraseña");
        String contra = sc.next();

        if (usuario.equals("admin")){
            System.out.println("Usuario  corecto");
            if (contra.equals("1234")){
                System.out.println("Acceso concedido");
                            }
            else {
                System.out.println("Contraeña incorrecta");
            }
        }else{
            System.out.println("Usuario incorrecto");
        }
        */
 //MEJORA Scanner sc = new Scanner(System.in);
        //
        //System.out.println("Introduce el usuario");
        //String usuario = sc.next();
        //
        //System.out.println("Introduce la contraseña");
        //String contra = sc.next();
        //
        //String userCorrecto = "admin";
        //String passCorrecto = "1234";
        //
        //if (usuario.equals(userCorrecto) && contra.equals(passCorrecto)) {
        //    System.out.println("Acceso concedido");
        //} else {
        //    System.out.println("Usuario o contraseña incorrectos");
        //}

    }
}