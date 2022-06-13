package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

public interface CarDao {
    User getUserByCar(String model, int series);
}
