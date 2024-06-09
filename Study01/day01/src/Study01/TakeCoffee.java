package Study01;

public class TakeCoffee {
    public static void main(String[] args) {
        Employee kim = new Employee("김씨", 10000);
        Employee Lee = new Employee("이씨", 10000);
        Cafe cafe = new Cafe("별다방", "아메리카노");
        Cafe cafe2 = new Cafe("콩다방", "라떼");

        kim.takeAmericano(cafe);
        Lee.takeLatte(cafe2);
        kim.showInfo();
        Lee.showInfo();
        cafe.showInfo();
        cafe2.showInfo();
    }
}
