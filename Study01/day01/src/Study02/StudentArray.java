package Study02;

import java.util.Arrays;

public class StudentArray {
    public static void main(String[] args) {
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student(1001, "James");
        studentArray[1] = new Student(1002, "Tomas");
        studentArray[2] = new Student(1003, "Edward");

        for(int i = 0; i < studentArray.length; i++) {
            studentArray[i].showStudentInfo();
        }

        for (Student student : studentArray) {
            student.showStudentInfo();
        } // 향상된 for문 버전

        Arrays.stream(studentArray)
                .forEach(Student::showStudentInfo);
        // 스트림의 각각 요소를 Student의 showStudentInfo 메서드를 사용하여 출력하겠다는 뜻
        // 스트림 요소를 출력할때는 forEach가 가능
    }
}
