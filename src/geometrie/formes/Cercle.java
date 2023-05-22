package geometrie.formes;

import java.text.DecimalFormat;

public class Cercle implements ObjetGeometrique {
    private static final double PI = Math.PI;
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String perimetre() {
        double num = PI * rayon * 2;
        return decfor.format(num);
    }

    @Override
    public String surface() {
        double num = 2 * PI * Math.pow(rayon, 2);
        return decfor.format(num);
    }

    @Override
    public String toString() {
        return "Cercle " +
                "rayon=" + rayon;
    }
}
