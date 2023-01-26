package dao;

import model.Car;

import java.util.List;

public interface CarDao {
    List<Car> addCarsInList();

    List<Car> listWithCount(List<Car> list, int count);

}
