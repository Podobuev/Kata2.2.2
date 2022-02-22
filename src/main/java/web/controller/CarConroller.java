package web.controller;

import Car.Config.CarConfig;
import Car.madel.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Car.service.CarServiceImp;

import java.util.List;

@Controller
public class CarConroller {


    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(CarConfig.class);

    CarServiceImp carServiceImp = context.getBean(CarServiceImp.class);

//    @Autowired
//    private CarServiceImp carServiceImp;

    @GetMapping(value = "/")
    public String printWelcome(@RequestParam(value = "counter", required = false) Integer counter,
                               Model model) {

        List<Car> list2;
        if (counter == null || counter > 5) {
            list2 = carServiceImp.getList();
        } else if (counter < 0) {
            list2 = null;
        } else {
            list2 = carServiceImp.getCar(counter, carServiceImp.getList());
        }

        model.addAttribute("list", list2);
        return "index";
    }

}
