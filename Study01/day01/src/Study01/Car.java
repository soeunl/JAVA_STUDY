package Study01;

public class Car {

    private static int serialNum = 10001;
    int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
