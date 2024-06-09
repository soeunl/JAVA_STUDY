package Study01;

public class CardFactoryTest {
    public static void main(String[] args) {
        CardFactory cardfactory = CardFactory.getInstance();
        Card myCard = cardfactory.createCard();
        System.out.println(myCard.getCardNumber());
    }
}
