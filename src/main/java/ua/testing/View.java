package ua.testing;

/**
 * <h1>More Less Game (TDD + Junit)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-04
 */
public class View {
    public static final String GUESS_INT_DATA = "Guess INT value between 0 and 100. ";
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String CONGRAT_MSG = "Congratulations! You have guessed the selected number successfully. ";
    public static final String STATISTICS_MSG = "\n\"More less\" game statistics: ";
    public static final String STATISTICS_MSG_BEGIN = "Supposed value ";
    public static final String STATISTICS_MSG_MIDDLE_EQUALS = "equals to selected value (";
    public static final String STATISTICS_MSG_MIDDLE_NOT_EQUALS = " than selected value (";
    public static final String STATISTICS_MSG_END = "). ";
    public static final String STATISTICS_ERROR_MSG_END = " than selected value. ";
    public static final String SPACE = " ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String message) {
        System.err.println(message);
    }

    public void printNotGuessedValueMessage(int supposedValue, String resultMsg) {
        System.err.println(STATISTICS_MSG_BEGIN + supposedValue + SPACE + resultMsg + STATISTICS_ERROR_MSG_END);
    }
}
