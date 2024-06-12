package Study04;

public abstract class Car3 {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();

    public void washCar() {
        System.out.println("💜세차를 합니다");
    };

    final public void run() {
        start();
        drive();
        stop();
        turnoff();
        washCar();
    }
    public abstract void show();
}
