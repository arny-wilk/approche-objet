package entites;

public class AdressePostale {
    int numero_rue;
    String libelle_rue;
    int zipcode;
    String ville;

    AdressePostale(int numero_rue, String libelle_rue, int zipcode, String ville) {
        this.numero_rue = numero_rue;
        this.libelle_rue = libelle_rue;
        this.zipcode = zipcode;
        this.ville = ville;
    }
}
