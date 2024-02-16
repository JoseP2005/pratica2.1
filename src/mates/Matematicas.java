package mates;

import java.util.Random;

public class Matematicas {
    public static double generarNumeroPiIterativo(int n) {
        Random generador = new Random();
        int CantidadPuntos = 0;
        for (int i = 0; i < n; i++) {
            double x = generador.nextDouble();
            double y = generador.nextDouble();
            if (x * x + y * y <= 1) {
                CantidadPuntos++;
            }
        }
        return 4.0 * CantidadPuntos / n;
    }
}