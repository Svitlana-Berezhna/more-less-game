package ua.testing;

import org.junit.Test;
import org.junit.Assert;

/**
 * <h1>More Less Game (TDD + Junit)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-04
 */
public class ControllerTest {
    public static final int INCREASE = 10;

    @Test
    public void whenExecuteMethodRandThenGetRandomNumberFromGivenRangeFromMinToMaxValueInclusive() {
        Controller controller = new Controller(new Model(), new View());
        int min = 1;
        int max = 99;
        int length = (max - min + 1) * INCREASE;
        for (int i = 0; i < length; i++) {
            int random = controller.rand(min, max);
            if (random > max || random < min) {
                Assert.fail("Random number " + random + " out of the given range from " + min + " to " + max + "!");
            }
        }
    }
}
