package racingcar.validator;

public class InvalidCarNameValidator {

    private static final int MAX_LENGTH = 5;
    private static final String ALPHABET_REGEX = "^[a-zA-z,]+$";

    private InvalidCarNameValidator() {
    }

    public static void validateCarName(String carName) {
        if(carName == null || carName.isBlank() || carName.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 1~5자 사이여야 합니다.");
        }
    }

    public static void validateSeparator(String carName) {
        if(!carName.matches(ALPHABET_REGEX)) {
            throw new IllegalArgumentException("영어 이름 및 구분자는 쉼표만 사용 가능합니다.");
        }
    }

}
