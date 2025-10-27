package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validator.InvalidCountValidator;

public class Input {

    public static int gameCount() {
        String count = Console.readLine();
        InvalidCountValidator.validateCount(count);
        return Integer.parseInt(count);
    }

    public static String carNames() {
        return Console.readLine();
    }

}
