package sets.pays;

public class Pays {
    private String nom;
    private double nbHabitants;
    private double gdpByHabs;

    public Pays(String nom, double nbHabitants, double gdpByHabs) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.gdpByHabs = gdpByHabs;
    }

    public double getTotalGdp(){
        return nbHabitants*gdpByHabs;
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

    public double getGdpByHabs() {
        return gdpByHabs;
    }

    public void setGdpByHabs(double gdpByHabs) {
        this.gdpByHabs = gdpByHabs;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", nbHabitants='" + nbHabitants + '\'' +
                ", gdpByHabs=" + gdpByHabs;
    }
}
