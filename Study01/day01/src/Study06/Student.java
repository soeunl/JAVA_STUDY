package Study06;

public class Student {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "이름: " + name +" / "+ "학번: " + age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
