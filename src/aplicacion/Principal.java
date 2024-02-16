package aplicacion;

import mates.Matematicas;
import java.util.Scanner;

/**
 * Esta es la clase principal de la aplicación.
 */
public class Principal {
    /**
     * Método principal de la aplicación.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de puntos a utilizar para aproximar Pi: ");

        int cantidadPuntos;

        try {
            cantidadPuntos = scanner.nextInt();
            if (cantidadPuntos <= 0) {
                System.out.println("La cantidad de puntos debe ser un entero positivo.");
                return;
            }
            System.out.println("El número PI es " + Matematicas.generarNumeroPiIterativo(cantidadPuntos));
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número entero.");
        }
    }
}
