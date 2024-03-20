import java.util.Random;
import java.util.Scanner;
package javafaker;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faker faker = new Faker();
        Random rd = new Random();


        System.out.println("Dígame un número: ");
        int tam = Integer.parseInt(sc.nextLine());


        System.out.println("El array está compuesto por: ");
        String[] nombres = new String[tam];


        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = faker.name().name();
        }
        for (int i = 0; i < nombres.length - 1; i++) {
            System.out.print(nombres[i] + "-");
        }
        System.out.print(nombres[nombres.length - 1]);
        System.out.println();


        int cont = tam;


        while (cont != 0) {
            int aleatorio = rd.nextInt(tam);


            if (nombres[aleatorio] == "x") {
                System.out.println("Se ha errado el tiro ");
            } else if (!nombres[aleatorio].equals(null)) {
                System.out.print("Se ha dado a: ");
                System.out.println(nombres[aleatorio]);
                nombres[aleatorio] = "x";
                cont--;
            }
        }
        System.out.println("Se han eliminado todos los nombres.");
    }

}
}
