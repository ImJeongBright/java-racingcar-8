package racingcar.controller;

import racingcar.entity.Car;
import racingcar.entity.Cars;
import racingcar.validator.InvalidCarNameValidator;
import racingcar.view.Input;
import racingcar.view.Output;

import java.util.List;

public class GameController {

    public void start() {

        Output.printCarNamePrompt();
        String carNames = Input.carNames();
        Output.printGameCountPrompt();
        int count = Input.gameCount();

        InvalidCarNameValidator.validateSeparator(carNames);

        Cars cars = new Cars(carNames);

        for(int i = 0; i < count; i++) {
            cars.progressRacing();
            Output.printRacingResult(cars.getCars());
        }

        List<Car> byWinner = cars.findByWinners();

        Output.printFinalWinner(byWinner);
    }

}
