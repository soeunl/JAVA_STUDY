package Study01;

public class Student {
    public String studentName;     // 학생의 이름
    public int money;             // 학생이 가지고 있는 돈

    public Student(String studentName, int money)
    // 학생 이름과 돈을 매개변수로 받는 생성자
    {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.Money(10000);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println(studentName + "의 남은 돈은 " + money + "원 입니다.");
    }
}
