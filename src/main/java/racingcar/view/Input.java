package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static int gameCount() {
        return Integer.parseInt(Console.readLine());
    }

    public static String carNames() {
        return Console.readLine();
    }

}
