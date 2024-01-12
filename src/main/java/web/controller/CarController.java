package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMW", "black", 2012);
        Car car2 = new Car("Audi", "white", 2023);
        Car car3 = new Car("Mercedes", "grey", 2015);
        Car car4 = new Car("Porsche", "yellow", 2017);
        Car car5 = new Car("Bentley", "blue", 2020);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars = carService.getCarsCount(cars, count);
        model.addAttribute("carsList", cars);

        return "cars";
    }
}
