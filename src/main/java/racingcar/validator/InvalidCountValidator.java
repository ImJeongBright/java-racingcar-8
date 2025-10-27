package racingcar.validator;

public class InvalidCountValidator {

    private InvalidCountValidator() {

    }

    public static void validateCount(String count) {
        try {
            Integer.parseInt(count);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("자연수만 입력 가능합니다.");
        }
    }

}
