package maps;

public class Pays2 {
    private String nom;
    private double nbHabitants;
    private String continent;

    public Pays2(String nom, double nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(double nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", nbHabitants='" + nbHabitants + '\'' +
                ", continent=" + continent;
    }
}
