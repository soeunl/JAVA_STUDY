package Study03;

public class Animal {
    protected String animalName;
    protected String animalLevel;
    int point;
    double bonusPoint;

    public Animal(String animalName) {
        this.animalName = animalName;
        initAnimal();
    }

    private void initAnimal() {
        animalLevel = "NORMAL";
        bonusPoint = 1;
    }

    public int getPoint(int monster) {
        point += monster * bonusPoint;
        return point;
    }

    public String showAnimalInfo() {
        return animalName + "의 레벨은"+ " " + animalLevel + "이며, 포인트는 " + point + "점 입니다!";
    }
}