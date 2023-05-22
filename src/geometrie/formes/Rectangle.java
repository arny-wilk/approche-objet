package geometrie.formes;

public class Rectangle implements ObjetGeometrique {
    double longueur;
    double largeur;
    private static final String NAME = "Rectangle";

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (longueur + largeur) * 2;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
