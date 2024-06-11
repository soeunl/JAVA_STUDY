package Study02;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {

        ArrayList<Student01> students = new ArrayList<Student01>();
        students.add(new Student01(1001, "James"));
        students.add(new Student01(1002, "Tomas"));
        students.add(new Student01(1003, "Edward"));

        for(int i = 0; i<students.size(); i++) {
            students.get(i).showStudentInfo();
        }
    }
}
