package Study02;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogArray = new Dog[5];
        dogArray[0] = new Dog("Dog1", "DogType1");
        dogArray[1] = new Dog("Dog2", "DogType2");
        dogArray[2] = new Dog("Dog3", "DogType3");
        dogArray[3] = new Dog("Dog4", "DogType4");
        dogArray[4] = new Dog("Dog5", "DogType5");


        for(int i = 0; i<dogArray.length; i++) {
            System.out.println(dogArray[i].showDogInfo());
        }

        System.out.println("==============");

        for(Dog dog : dogArray) {
            System.out.println(dog.showDogInfo());
        }
    }
}
