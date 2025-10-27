package racingcar.entity;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCars(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void progressRacing() {
        cars.forEach(Car::move);
    }

    public List<Car> findByWinner() {

        int maxValue = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition() == maxValue)
                .toList();

    }



}
