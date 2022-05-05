import com.nandosoft.utils.CustomQueue;
import com.nandosoft.utils.CustomStack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomStack pila = new CustomStack();

        int resultado = 0;
        int mostrar = 0;
        int numero = 0;
        int numero2 = 0;

        System.out.println("Introduzca el primer número para añadirlo en una pila");
        System.out.println("---------------------");
        numero = scanner.nextInt();
        scanner.nextLine();
        pila.push(numero);

        System.out.println("Introduzca el segundo número");
        numero2 = scanner.nextInt();
        pila.push(numero2);

        System.out.println("Ahora ingrese le operación aritmética deseada");
        System.out.println("------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                for (int i = 0; i < 2; i++) {

                    mostrar = pila.pop();

                    System.out.print((mostrar) + " | ");
                    resultado += mostrar;
                }
                System.out.println("\n\tEl resultado de la suma de esos números es : " + resultado);
                break;
            case 2:

                mostrar = pila.pop();
                resultado = pila.pop();

                System.out.print(mostrar + " | " + resultado);
                resultado = mostrar - resultado;

                System.out.println("\n\tEl resultado de la resta de esos números es : " + resultado);
                break;
            case 3:

                mostrar = pila.pop();
                resultado = pila.pop();

                System.out.print(mostrar + " | " + resultado);
                resultado = mostrar * resultado;

                System.out.println("\n\tEl resultado de la multiplicación de esos números es : " + resultado);
                break;
            case 4:

                mostrar = pila.pop();
                resultado = pila.pop();

                System.out.print(mostrar + " | " + resultado);
                resultado = mostrar / resultado;

                System.out.println("\n\tEl resultado de la división de esos números es : " + resultado);
                break;
            default:
                System.out.println("No esta entre las opciones dadas");
        }


    }
}
