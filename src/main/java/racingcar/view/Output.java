package racingcar.view;

import racingcar.constant.Notification;
import racingcar.entity.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Output {
    public static String NOTATE_HYPHEN = "-";
    public static String COLOGNE = " : ";

    public static void printCarNamePrompt() {
        System.out.println(Notification.PROMPT_CAR_NAMES.getNotification());
    }

    public static void printGameCountPrompt() {
        System.out.println(Notification.PROMPT_GAME_COUNT.getNotification());
    }

    public static void printFinalWinner(List<Car> cars) {
        System.out.println(Notification.FINAL_WINNER.getNotification() + getFormattedWinnerNames(cars));
    }

    public static void printRacingResult(List<Car> cars) {
        for (Car car : cars) {
            String value = convertValueToHyphen(car.getPosition());
            System.out.println(car.getName() + COLOGNE + value);
        }
    }

    private static String convertValueToHyphen(int value) {
        return NOTATE_HYPHEN.repeat(value);
    }

    private static String getFormattedWinnerNames(List<Car> cars) {
        return cars.stream().map(Car::getName).collect(Collectors.joining(", "));
    }
}
