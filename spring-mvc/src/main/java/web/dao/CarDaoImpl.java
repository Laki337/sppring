package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
	@Override
	public List<Car> createCars() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("car1", "colo1", 1));
		cars.add(new Car("car2", "color2", 1));
		cars.add(new Car("car3", "color3", 3));
		cars.add(new Car("car4", "color4", 4));
		cars.add(new Car("car5", "color5", 5));
		
		return cars;
	}
}
