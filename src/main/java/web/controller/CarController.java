package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();
    private List<Car> carList = carService.addCarsInList();

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "0") int count,
                               ModelMap model) {

        List<Car> carsTable = carService.listWithCount(carList, count);

        model.addAttribute("carsTable", carsTable);
        return "cars";
    }
}
