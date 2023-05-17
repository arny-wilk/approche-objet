package entites2;

import entites.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adressePostale;

    /**
     * @param nom
     * @param prenom
     * @param adressePostale adherent par default à false;
     */
    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setAdressePostale(AdressePostale adressePostale){
        this.adressePostale = adressePostale;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public void print() {
        System.out.println("Personne{" +
                "nom='" + nom.toUpperCase() + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressePostale=" + adressePostale +
                ", adherent=" +
                '}');
    }
}
