package Study01;

public class TakeTaxi {
    public static void main(String[] args) {

        Student studentEdward = new Student("Edward", 15000);

        Taxi taxi = new Taxi(1234);
        studentEdward.takeTaxi(taxi);
        taxi.showInfo();
    }
}
