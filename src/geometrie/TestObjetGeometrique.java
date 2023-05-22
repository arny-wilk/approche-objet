package geometrie;

import geometrie.formes.Cercle;
import geometrie.formes.ObjetGeometrique;
import geometrie.formes.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(2.5);
        Rectangle rectangle = new Rectangle(3.5, 1.5);

        ObjetGeometrique[] tableauObjetGeometrique = new ObjetGeometrique[2];

        tableauObjetGeometrique[0] = cercle;
        tableauObjetGeometrique[1] = rectangle;

        for (ObjetGeometrique objetGeometrique: tableauObjetGeometrique){
            System.out.println("Objet " + objetGeometrique);
            System.out.println("Perimetre : " + objetGeometrique.perimetre());
            System.out.println("Surface : " + objetGeometrique.surface());
        }
    }
}
