package ua.testing;

/**
 * <h1>More Less Game (TDD + Junit)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-04
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
