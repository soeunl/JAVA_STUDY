package Study04;

public class Sonata extends Car3 {
    @Override
    public void start() {
        System.out.println("🧡Sonata 시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println("🧡Sonata 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("🧡Sonata 멈춥니다.");
    }

    @Override
    public void turnoff() {
        System.out.println("🧡Sonata 시동을 끕니다.");
    }
}
