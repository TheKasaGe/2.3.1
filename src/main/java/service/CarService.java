package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> addCarsInList();

    List<Car> listWithCount(List<Car> list, int count);

}
