package geometrie.formes;

import java.text.DecimalFormat;

public interface ObjetGeometrique {

    DecimalFormat decfor = new DecimalFormat("0.00");
    /* Retourne les méthodes obligatoires que doit posséder un objet géométrique
    *
    */
    String perimetre();

    String surface();
}
