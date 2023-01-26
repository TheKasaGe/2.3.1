package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    private CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> addCarsInList() {
        return carDao.addCarsInList();
    }

    @Override
    public List<Car> listWithCount(List<Car> list, int count) {
        return carDao.listWithCount(list, count);
    }

}
