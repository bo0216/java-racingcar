package calculator;

import java.util.Objects;

public class StringCalculator {
    Double number1;
    Double number2;

    public double calculate(String input) {
        checkNullAndEmpty(input);

        String[] splitInput = input.split(" ");
        number1 = Double.parseDouble(splitInput[0]);

        for (int i = 1; i < splitInput.length; i += 2) {
            number2 = Double.parseDouble(splitInput[i + 1]);
            number1 = Operator.of(splitInput[i]).operate(number1, number2);
        }

        return this.number1;
    }

    public void checkNullAndEmpty(String input) {
        if (Objects.isNull(input) || input.trim().isEmpty()) {
            throw new IllegalArgumentException("empty or null String");
        }
    }

}

