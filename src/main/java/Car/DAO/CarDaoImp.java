package Car.DAO;

import Car.madel.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao <Car> {

    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("red", "audi", 20000));
        list.add(new Car("green", "tesla", 15000));
        list.add(new Car("blue", "bmw", 30000));
        list.add(new Car("black", "porshe", 35000));
        list.add(new Car("white", "ford", 5000));

    }

    public List<Car> getList() {
        return list;
    }

    public CarDaoImp(List<Car> list) {
        this.list = list;
    }

    public CarDaoImp(){}


    @Override
    public List<Car> getCar(int valueOfCar, List<Car> list) {
        return list.subList(0, valueOfCar);
    }
}
