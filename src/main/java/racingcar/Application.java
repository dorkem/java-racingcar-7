package racingcar;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarController carController = new CarController(inputView);
        carController.start();
    }
}
