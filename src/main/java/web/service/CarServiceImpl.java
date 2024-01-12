package web.service;

import org.springframework.stereotype.Service;
import web.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsCount(List<Car> cars, int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
