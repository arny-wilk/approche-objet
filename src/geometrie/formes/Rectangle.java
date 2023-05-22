package geometrie.formes;

import java.text.DecimalFormat;

public class Rectangle implements ObjetGeometrique {
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public String perimetre() {
        double num = (longueur + largeur) * 2;
        return decfor.format(num);
    }

    @Override
    public String surface() {
        double num = longueur * largeur;
        return decfor.format(num);
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "longueur=" + longueur +
                ", largeur=" + largeur;
    }
}
