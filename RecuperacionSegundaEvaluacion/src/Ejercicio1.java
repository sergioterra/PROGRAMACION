import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * n);
        }

        System.out.println("El array es: ");

        int suma = 0;
        for (int numero : numeros){
            suma +=numero;
        }


        for (int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.println("\nSuma de los numeros del Array: " + suma);

        //Numeros pares e impares

        int paresConta = 0;
        int imparesConta = 0;

        for (int numero : numeros){
            if (numero % 2 == 0){
                paresConta++;
            }else{
                imparesConta++;
            }
        }

        System.out.println("Numeros pares: " + paresConta);
        System.out.println("Numero impares: " + imparesConta);



    }
}
