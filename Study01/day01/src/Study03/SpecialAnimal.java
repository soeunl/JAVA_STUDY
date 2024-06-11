package Study03;

public class SpecialAnimal extends Animal {

    public SpecialAnimal(String animalName) {
        super(animalName);
        animalLevel = "SPECIAL";
        bonusPoint = 3;
    }

//    public int getPoint(int monster) {
//        point += monster * bonusPoint;
//        return point;
//    }
}
