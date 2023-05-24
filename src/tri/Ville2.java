package tri;

public class Ville2 {
    private String nom;
    private int nbHabitants;

    public Ville2(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

//    @Override
//    public int compareTo(Ville2 o) {
//        if(o.getNbHabitants() < this.getNbHabitants()){
//            return +1;
//        }else if(o.getNbHabitants() > this.getNbHabitants()){
//            return -1;
//        }
////        int result = this.nom.compareTo(o.getNom());
//        return 0;
//    }

    @Override
    public String toString() {
        return nom + ", " + nbHabitants;
    }

}
