package Study02;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("James", "진돗개"));
        dogs.add(new Dog("Tomas", "치와와"));
        dogs.add(new Dog("Edward", "비숑"));

        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).showDogInfo());
        }
        System.out.println("=========");

        for(Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
