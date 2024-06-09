package Study01;

public class Cafe {
    String cafe; // 카페 이름
    String menu;  // 메뉴 이름
    int money;   // 카페의 수입

    public Cafe(String cafe, String menu)
    // 카페 이름과 메뉴 이름을 매개변수로 받는 생성자
    {
        this.cafe = cafe;
        this.menu = menu;
    }

    public void Money(int money)   // 카페의 수입
    {
        this.money += money;    // 카페 수입 증가
    }

    public void showInfo() {   // 카페의 수입 정보를 출력하는 함수
        System.out.println(cafe + "의 수입은 " + money + "원 입니다.");
    }
}
