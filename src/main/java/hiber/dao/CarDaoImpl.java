package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.TypedQuery;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public User getUserByCar(String model, int series) {
        TypedQuery<User> result = sessionFactory.getCurrentSession().createQuery("SELECT user FROM User user WHERE user.car.model=:autoModel and user.car.series=:autoSeries");
        result.setParameter("autoModel", model);
        result.setParameter("autoSeries", series);
        return result.getSingleResult();
    }
}
