package Study02;

import java.util.Arrays;

// 배열의 모든 요소를 출력하는 다양한 방법

public class ArrayTest {
    public static void main(String[] args) {
        int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        int sum = 0;
//        for(int i = 0; i < num.length; i++) {
//            sum += num[i];
//       } System.out.println(sum);
//        // 기본 for문으로 출력하는 방법

//        int sum = 0;
//        for(int i : num) {
//            sum += i;
//        } System.out.println(sum);
//        // 향상된 for문으로 출력하는 방법

        int sum = Arrays.stream(num).sum();
        System.out.println(sum); // Stream 이용
//        배열 num을 기반으로  IntStream을 생성
//        이 IntStream은 배열의 요소를 요소 스트림으로 가짐
//        생성된 IntStream에 대해 sum() 메서드를 호출하며
//        이 메서드는 스트림의 모든 요소를 더한 값을 반환
    }
}
