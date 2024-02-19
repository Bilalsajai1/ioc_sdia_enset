package metier;
import dao.IDao;

import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
   private IDao dao ;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
       double tmp = dao.getData();
       double res  = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
