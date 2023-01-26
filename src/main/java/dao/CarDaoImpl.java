package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> addCarsInList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Lada", 2114, 2010));
        list.add(new Car("GAZ", 3110, 2000));
        list.add(new Car("BMW", 5, 2015));
        list.add(new Car("Lada", 2110, 2001));
        list.add(new Car("Audi", 100, 2003));

        return list;
    }

    @Override
    public List<Car> listWithCount(List<Car> list, int count) {
        List<Car> newList = new ArrayList<>();
        if (count == 0) {
            count = list.size();
        }
        for (int i = 0; i < count && i < list.size(); i++) {
            newList.add(list.get(i));
        }
        return newList;
    }

}
