package ua.testing;

import java.util.Random;
import java.util.Scanner;

/**
 * <h1>More Less Game (TDD + Junit)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-04
 */
public class Controller {
    public static final String RESULT_EQUAL_SIGN = "=";
    public static final String RESULT_LESS_SIGN = "<";
    public static final String RESULT_MORE_SIGN = ">";
    public static final String RESULT_LESS_MSG = "less";
    public static final String RESULT_MORE_MSG = "more";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        int selectedValue = rand(1, 99);
        model.setSelectedValue(selectedValue);
        view.printMessage(view.GUESS_INT_DATA);
        System.out.println(selectedValue);

        Scanner sc = new Scanner(System.in);
        while (true) {
            int supposedValue = inputIntValueWithScanner(sc);
            String resultSign, resultMsg = "";
            if (supposedValue == selectedValue) {
                resultSign = RESULT_EQUAL_SIGN;
                model.setValueToStatistics(View.STATISTICS_MSG_BEGIN + View.STATISTICS_MSG_MIDDLE_EQUALS +
                        supposedValue + View.SPACE + resultSign + View.SPACE + selectedValue + View.STATISTICS_MSG_END);
                view.printMessage(view.CONGRAT_MSG);
                view.printMessage(view.STATISTICS_MSG);
                for (String statistics : model.getStatistics()) {
                    view.printMessage(statistics);
                }
                break;
            } else {
                resultSign = supposedValue < selectedValue ? RESULT_LESS_SIGN : RESULT_MORE_SIGN;
                resultMsg = supposedValue < selectedValue ? RESULT_LESS_MSG : RESULT_MORE_MSG;
                view.printNotGuessedValueMessage(supposedValue, resultMsg);
                model.setValueToStatistics(View.STATISTICS_MSG_BEGIN + resultMsg + View.STATISTICS_MSG_MIDDLE_NOT_EQUALS +
                        supposedValue + View.SPACE + resultSign + View.SPACE + selectedValue + View.STATISTICS_MSG_END);
            }
        }
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printErrorMessage(View.WRONG_INPUT_INT_DATA);
            view.printMessage(View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
