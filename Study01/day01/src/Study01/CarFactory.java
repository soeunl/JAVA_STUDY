package Study01;

public class CarFactory {

    private static CarFactory instance = new CarFactory(); // 유일하게 생성한 인스턴스
    // 유일한 자동차 공장

    private CarFactory() {} // private으로 선언한 생성자

    public static CarFactory getInstance() { // 외부에서 참조할 수 있는 public 메서드 만들기
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() { // Car 클래스를 객체로 생성
        Car car = new Car();
        return car;
    }
}
