package mates;

import java.util.Random;

/**
 * Esta clase proporciona métodos para operaciones matemáticas.
 */
public class Matematicas {
    /**
     * Genera una aproximación de Pi usando un método de Monte Carlo.
     *
     * @param n el número de puntos aleatorios a generar
     * @return la aproximación de Pi
     */
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