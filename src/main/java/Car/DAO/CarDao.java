package Car.DAO;

import java.util.List;

public interface CarDao <T>{

    List<T> getCar(int valueOfCar, List<T> list);
}
