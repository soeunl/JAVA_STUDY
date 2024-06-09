package Study01;

public class Employee {
    public String name;     // 이름
    public int money;      // 가지고 있는 돈

    public Employee(String name, int money)
    // 이름과 돈을 매개변수로 받는 생성자
    {
        this.name = name;
        this.money = money;
    }

    public void takeAmericano(Cafe cafe) {
        cafe.Money(10000);
        this.money -= 4000;
    }

    public void takeLatte(Cafe cafe2) {
        cafe2.Money(10000);
        this.money -= 4500;
    }

    public void showInfo() {
        System.out.println(name + "의 남은 돈은 " + money + "원 입니다.");
    }
}
