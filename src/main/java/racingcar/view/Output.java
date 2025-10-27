package racingcar.view;

import racingcar.constant.Notification;
import racingcar.entity.Car;

import java.util.List;

public class Output {
    public static String NOTATE_HYPHEN = "-";
    public static String COLOGNE = " : ";

    public static void printCarNamePrompt() {
        System.out.println(Notification.PROMPT_CAR_NAMES.getNotification());
    }

    public static void printGameCountPrompt() {
        System.out.println(Notification.PROMPT_GAME_COUNT.getNotification());
    }

    public static void printFinalWinner(String winners) {
        System.out.println(Notification.FINAL_WINNER + winners);
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

}
