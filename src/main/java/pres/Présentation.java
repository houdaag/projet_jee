package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Présentation {
    public static void main(String[] args) {
        //Injection des dépendances par instanciation statique => new

        //DaoImpl dao=new DaoImpl();
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Résultat: "+metier.calcul());
    }
}
