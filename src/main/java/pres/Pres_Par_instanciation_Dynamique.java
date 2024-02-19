package pres;
import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Pres_Par_instanciation_Dynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(new File("config.txt"));
       String daoClassName = scanner.nextLine();
       Class cDao = Class.forName(daoClassName);
       IDao dao = (IDao) cDao.newInstance();

       String metietClassName = scanner.nextLine();
       Class cMetier = Class.forName(metietClassName);
       IMetier metier = (IMetier) cMetier.newInstance();

       Method method = cMetier.getMethod("setDao",IDao.class);
       method.invoke(metier,dao);
        System.out.println("résultat :" +metier.calcul());
    }
}