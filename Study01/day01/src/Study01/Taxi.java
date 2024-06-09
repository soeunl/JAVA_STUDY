package Study01;

public class Taxi {
    int taxiNum;  // 택시 번호
    int money;   // 택시의 수입

    public Taxi(int taxiNum)   // 택시 번호를 매개변수로 받는 생성자
    {
        this.taxiNum = taxiNum;
    }

    public void Money(int money)   // 택시의수입
    {
        this.money += money;    // 택시의 수입 증가
    }

    public void showInfo() {      // 택시의 정보를 출력하는 함수
        System.out.println(taxiNum + " 택시의 수입은 " + money + "원 입니다.");
    }
}
