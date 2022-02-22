package Car.service;

import Car.DAO.CarDaoImp;
import Car.madel.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService<Car> {

    @Autowired
    private CarDaoImp carDaoImp;

    @Override
    public List<Car> getCar(int valueOfCar, List<Car> list) {
        return carDaoImp.getCar(valueOfCar, list);
    }

    public List<Car> getList() {
        return carDaoImp.getList();
    }
}


