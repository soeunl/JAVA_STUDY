package Study02;

public class Student01 {
    int studentID;
    String studentName;

    public Student01(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void showStudentInfo() {
        System.out.println( studentID + "," + studentName);
    }
}
