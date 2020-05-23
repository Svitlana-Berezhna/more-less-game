package ua.testing;

import java.util.ArrayList;

/**
 * <h1>More Less Game (TDD + Junit)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-04
 */
public class Model {
    private int selectedValue;
    ArrayList<String> statistics = new ArrayList<String>();

    public void setSelectedValue(int selectedValue) {
        this.selectedValue = selectedValue;
    }

    public ArrayList<String> getStatistics() {
        return statistics;
    }

    public void setValueToStatistics(String result) {
        statistics.add(result);
    }
}
