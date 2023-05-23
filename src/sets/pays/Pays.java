package sets.pays;

public class Pays {
    private String nom;
    private String nbHabitants;
    private double gdpByHabs;

    public Pays(String nom, String nbHabitants, double gdpByHabs) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.gdpByHabs = gdpByHabs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(String nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public double getGdpByHabs() {
        return gdpByHabs;
    }

    public void setGdpByHabs(double gdpByHabs) {
        this.gdpByHabs = gdpByHabs;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants='" + nbHabitants + '\'' +
                ", gdpByHabs=" + gdpByHabs +
                '}';
    }
}
