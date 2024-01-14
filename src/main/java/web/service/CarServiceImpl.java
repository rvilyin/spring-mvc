package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
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
    }

    @Override
    public List<Car> getCarsCount(int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
