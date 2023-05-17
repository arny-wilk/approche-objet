package entites2;

import entites.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adressePostale;
    boolean adherent = false;

    /**
     * @param nom
     * @param prenom
     * @param adressePostale
     * adherent par default à false;
     */
    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
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

    public boolean isAdherent() {
        return adherent;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void setAdherent(boolean adherent) {
        this.adherent = adherent;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressePostale=" + adressePostale +
                ", adherent=" + adherent +
                '}';
    }
}
