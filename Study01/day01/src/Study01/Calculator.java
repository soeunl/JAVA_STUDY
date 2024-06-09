package Study01;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result1 = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result1);

        int result2 = minus(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + result2);

        int result3 = multiple(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result3);

        double result4 = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + result4);
    }

    public static int add(int num1, int num2){
        int result1 = num1 + num2;
        return result1;
    }

    public static int minus(int num1, int num2){
        int result2 = num1 - num2;
        return result2;
    }

    public static int multiple(int num1, int num2){
        int result3 = num1 * num2;
        return result3;
    }

    public static double divide(double num1, double num2){
        double result4 = num1 / num2;
        return result4;
    }
}
