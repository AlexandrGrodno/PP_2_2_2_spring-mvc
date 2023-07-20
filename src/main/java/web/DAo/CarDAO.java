package web.DAo;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDAO {
    private static List<Car>carList;
    {   carList=new ArrayList<>();
        carList.add(new Car("AUDI","A6",2));
        carList.add(new Car("BMW","X6",3));
        carList.add(new Car("Tesla","Model S",1));
        carList.add(new Car("Lexus","RX",2));
        carList.add(new Car("LADA","2107",22));
    }

    public static List<Car> getCarList(int number) {

        return carList.stream().limit(number).toList();
    }

}
