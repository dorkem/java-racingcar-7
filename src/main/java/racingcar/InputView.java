package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    public List<String> inputCar(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carName = Console.readLine();
        List<String> carList = Arrays.stream(carName.split(","))
                .toList();
        return carList;
    }

    public int inputMaxRound(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        String maxRound = Console.readLine();
        int maxRoundNum = Integer.parseInt(maxRound);
        return maxRoundNum;
    }
}
