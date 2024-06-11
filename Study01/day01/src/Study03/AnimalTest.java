package Study03;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("망아지");
        animal.point = 100;

        System.out.println(animal.showAnimalInfo());

        Animal specialAnimal = new SpecialAnimal("유니콘");
        specialAnimal.point = 100;

        System.out.println(specialAnimal.showAnimalInfo());

        int monster = 100;
        int animalPoint = animal.getPoint(monster);
        int specialAnimalPoint = specialAnimal.getPoint(monster);

        System.out.println(monster + "점 몬스터를 무찌르고 " + animal.animalName + "가 " + animalPoint + "점을 얻었습니다.");
        System.out.println(monster + "점 몬스터를 무찌르고 " + specialAnimal.animalName + "이 " + specialAnimalPoint + "점을 얻었습니다.");
    }
}
