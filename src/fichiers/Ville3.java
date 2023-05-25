package fichiers;

public class Ville3 {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotal;

    public Ville3(String nom, String codeDepartement, String nomRegion, int populationTotal) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotal = populationTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public double getPopulationTotal() {
        return populationTotal;
    }

    public void setPopulationTotal(int populationTotal) {
        this.populationTotal = populationTotal;
    }

    @Override
    public String toString() {
        return nom + ';' +
                codeDepartement + ';' +
                nomRegion + ';' +
                populationTotal;
    }
}
