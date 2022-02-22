
import Car.Config.CarConfig;
import Car.madel.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Car.service.CarServiceImp;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CarConfig.class);

//        CarDaoImp carDaoImp = context.getBean(CarDaoImp.class);
        CarServiceImp carServiceImp = context.getBean(CarServiceImp.class);

//        List<Car> list = new ArrayList<>();
//        list.add(new Car("red", "audi", 20000));
//        list.add(new Car("green", "tesla", 15000));
//        list.add(new Car("blue", "bmw", 30000));
//        list.add(new Car("black", "porshe", 35000));
//        list.add(new Car("white", "ford", 5000));

//        List<Car> list2 = carDaoImp.getCar(3, list);

        for (Car car: carServiceImp.getList()) {
            System.out.println(car);
        }
    }
}
