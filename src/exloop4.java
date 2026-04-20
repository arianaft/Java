public class exloop4 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int i= 0; i< numeros.length; i++){
            suma = suma + numeros[i];
        }
        System.out.println("La suma es :" + suma);

        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
