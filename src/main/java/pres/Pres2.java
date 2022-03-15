package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine(); //Connaître le nom de la classe
        Class cDao=Class.forName(daoClassName); //Charger la classe en mémoire
        IDao dao =(IDao) cDao.newInstance();// Instancier la classe

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method methode=cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        methode.invoke(metier,dao);
        System.out.println("Résultat: "+metier.calcul());
    }
}
