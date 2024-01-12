package web.service;

import web.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCarsCount(List<Car> cars, int count);
}
