package racingcar.entity;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.constant.Movement.*;

public class Car {

    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move() {
        if(Randoms.pickNumberInRange(RANDOM_START_NUMBER, RANDOM_END_NUMBER) >= MOVE_POSSIBLE_NUMBER) {
            this.position++;
        }
    }
    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
