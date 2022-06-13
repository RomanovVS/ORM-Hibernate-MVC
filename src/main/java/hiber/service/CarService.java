package hiber.service;

import hiber.model.Car;
import hiber.model.User;

public interface CarService {
    User getUserByCar(String model, int series);
}
