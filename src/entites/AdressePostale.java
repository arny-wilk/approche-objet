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

    public int getNumero_rue() {
        return numero_rue;
    }

    public void setNumero_rue(int numero_rue) {
        this.numero_rue = numero_rue;
    }

    public String getLibelle_rue() {
        return libelle_rue;
    }

    public void setLibelle_rue(String libelle_rue) {
        this.libelle_rue = libelle_rue;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numero_rue=" + numero_rue +
                ", libelle_rue='" + libelle_rue + '\'' +
                ", zipcode=" + zipcode +
                ", ville='" + ville + '\'' +
                '}';
    }
}
