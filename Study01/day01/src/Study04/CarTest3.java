package Study04;

import java.util.ArrayList;
import java.util.Arrays;

public class CarTest3 {
    public static void main(String[] args) {
        ArrayList<Car3> carList = new ArrayList<Car3>();

        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());

        for(Car3 car : carList) {
            car.run();
            System.out.println("❤️=============❤️");
        }

        for(Car3 show : carList) {
            show.show();
        }
    }
}
