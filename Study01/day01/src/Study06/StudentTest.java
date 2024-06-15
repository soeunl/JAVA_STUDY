package Study06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentTest {
    public static void main(String[] args) {
        Class studentClass = Student.class;

        Constructor[] cons = studentClass.getConstructors();
        for(Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println();

        Method[] methods = studentClass.getMethods();

        for(Method m : methods) {
            System.out.println(m);
        }

        System.out.println();
        Field[] fields = studentClass.getFields();
        for(Field f : fields) {
            System.out.println(f);
            System.out.println(f.getName());
        }
    }
}
