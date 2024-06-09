package Study01;

public class Card {

    private static int serialNum = 1000;
    int cardNumber;

    public Card(){
        serialNum++;
        cardNumber = serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
