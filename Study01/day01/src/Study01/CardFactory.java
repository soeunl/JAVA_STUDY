package Study01;

public class CardFactory {
    private static CardFactory instance = new CardFactory(); // 유일하게 생성한 인스턴스

    private CardFactory() {} // private으로 선언한 생성자

    public static CardFactory getInstance() { // 외부에서 참조할 수 있는 public 메서드 만들기
        if(instance == null) {
            instance = new CardFactory();
        }
        return instance;
    }

    public Card createCard() { // Card 클래스를 객체로 생성
        Card card = new Card();
        return card;
    }
}
