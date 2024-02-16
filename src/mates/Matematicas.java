package mates;
import java.util.Random;
public class Matematicas {
    public static double generarPiIterativo(int n) {
        Random r = new Random();
        int dentroCirculo = 0;
        for (int i = 0; i < n; i++) {
            double x = r.nextDouble();
            double y = r.nextDouble();
            if (x * x + y * y <= 1) {
                dentroCirculo++;
            }
        }
        return 4.0 * dentroCirculo / n;
    }
}
