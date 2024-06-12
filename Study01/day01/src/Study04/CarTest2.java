package Study04;

public class CarTest2 {
    public static void main(String[] args) {

        System.out.println("=== 자율주행 하는 자동차 ===");
        Car2 aiCar = new AICar();
        aiCar.run();

        System.out.println("=== 사람이 운전하는 자동차 ===");
        Car2 peopleCar = new ManualCar();
        peopleCar .run();
    }
}
