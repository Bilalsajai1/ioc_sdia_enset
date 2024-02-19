package dao;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        se connecter a la BD pour récuperer la température
         */
        System.out.println("Version base de données");
        double temp = Math.random()*40;
        return temp;
    }
}
