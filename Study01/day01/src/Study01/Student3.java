package Study01;

public class Student3 {

    private static int serialNum = 1000;
    int studentID;
    int cardNumber;

    public Student3(){
        serialNum++;
        studentID = serialNum;
        cardNumber = studentID + 100;
    }
}
