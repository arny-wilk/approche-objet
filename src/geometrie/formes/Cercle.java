package geometrie.formes;

public class Cercle implements ObjetGeometrique {
    private static final double PI = Math.PI;
    double rayon;
    private static final String NAME = "Cercle";

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return PI * rayon * 2;
    }

    @Override
    public double surface() {
        return 2 * PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
