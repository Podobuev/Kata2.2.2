package Car.service;

import java.util.List;

public interface CarService <T>{

    List<T> getCar(int valueOfCar, List<T> list);
}
