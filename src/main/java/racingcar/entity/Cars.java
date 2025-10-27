package racingcar.entity;

import racingcar.validator.InvalidCarNameValidator;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String NAME_SEPARATOR = ",";
    private final List<Car> cars;

    public Cars(String carNames) {
        cars = new ArrayList<>();
        addCars(carNames);
    }

    private String[] separateCarName(String carName) {

        String[] carNames = carName.split(NAME_SEPARATOR);

        for (String name : carNames) {
            InvalidCarNameValidator.validateCarName(name);
        }

        return carNames;
    }

    private void addCars(String carName) {
        String[] carNames = separateCarName(carName);

        for (String name : carNames) {
            cars.add(new Car(name, 0));
        }

    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void progressRacing() {
        cars.forEach(Car::move);
    }

    public List<Car> findByWinners() {

        int maxValue = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition() == maxValue)
                .toList();

    }
}
