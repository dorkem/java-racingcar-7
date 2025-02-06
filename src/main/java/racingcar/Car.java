package racingcar;

public class Car {
    //랜덤을 0~1씩돌림 0이면 stop, 1이면 go
    private String name;

    private int position = 0;

    Car (String name){
        this.name = name;
    }

    public void move() {
        this.position += 1;
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }
}
