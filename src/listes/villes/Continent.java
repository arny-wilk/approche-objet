package listes.villes;

public enum Continent {
    AMERIQUE_NORD("Amérique du Nord"),
    AMERIQUE_SUD("Amérique du Sud"),
    AFRIQUE("Afrique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    ;

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "libelle='" + libelle;
    }
}
