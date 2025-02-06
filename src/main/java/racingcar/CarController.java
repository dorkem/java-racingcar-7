package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedList;
import java.util.List;

public class CarController {

    private InputView inputView;

    public CarController(InputView inputView) {
        this.inputView = inputView;
    }

    public void start(){
        //입력
        List<Car> cars = inputCars();
        //실행
        run(cars);

        //출력
        outPut(cars);
    }

    public List<Car> inputCars(){
        List<String> carNames = inputView.inputCar();
        List<Car> cars = carNames.stream()
                .map(Car::new)
                .toList();
        return cars;
    }

    public void run(List<Car> cars) {
        int maxRound = inputView.inputMaxRound();
        for (int round = 0; round < maxRound; round++) {
            for (Car car: cars){
                int randomNum = Randoms.pickNumberInRange(0,9);
                if (randomNum > 5){
                    car.move();
                }
                String dashes = "-".repeat(car.getPosition());
                System.out.printf("%s : %s\n", car.getName(), dashes);
            }
            System.out.println();
        }
    }

    public void outPut(List<Car> cars) {
        List<String> Winner = new LinkedList<>();
        int maxValue = 0;
        for (Car car: cars){
            if(car.getPosition() >= maxValue){
                maxValue = car.getPosition();
            }
        }

        for (Car car: cars){
            if(car.getPosition() == maxValue){
                Winner.add(car.getName());
            }
        }

        String printWinner = String.join(", ", Winner);
        System.out.println(printWinner);
    }
}
