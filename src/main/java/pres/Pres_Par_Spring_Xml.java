package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres_Par_Spring_Xml {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier =(IMetier) context.getBean("metier");
        System.out.println("Resultat ! "+metier.calcul());
    }
}
