package pres;

import dao.DaoImpl;
import metier.MetierImpl;



public class Pres_Par_instanciation_Statique {
    public static void main(String[] args) {
       /*
       ces trois lignes de codes font  l'injection des dépendances
        Par instanciation statique => new
        */
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultats :" + metier.calcul());
    }
}
