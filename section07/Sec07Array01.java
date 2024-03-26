package Section07;

public class Sec07Array01 {
    public static void main(String[] args) {
        // 배열 실습
        // [1] 배열 사용
        int nums[] = new int[3];
        // nums = new int[3];

        // nums[0] = 100;
        // nums[1] = 200;
        // nums[2] = 300;

        System.out.println(nums[0] = 100); // 100
        System.out.println(nums[1] = 200); // 200
        System.out.println(nums[2] = 300); // 300

        // String 배열
        // String str[];         // 배열 선언
        // str = new String[3];   // 문자열 몇 개를 할당할 것인지를 설정

        String str[] = new String[3];

        str[0] = "Superman";
        str[1] = "Batman";
        str[2] = "Antman";

        System.out.println(str[0]); // Superman
        System.out.println(str[1]); // Batman
        System.out.println(str[2]); // Antman
        System.out.println(str[2] = "Ironman"); // Ironman
        // System.out.println(str[3] = "Wonderwoman"); // Error

        // [2] 배열의 여러가지 작성 방법
        // [2-1]
        // int num[] = new int[3]{100, 200, 300}; // Error ~> 초깃값이 저장되었기 때문
        int num[] = new int[]{100, 200, 300};
        System.out.println(num[0]); // 100
        System.out.println(num[1]); // 200
        System.out.println(num[2]); // 300

        double num1[] = new double[4];
        System.out.println(num1[0]); // 0.0
        System.out.println(num1[1]); // 0.0

        // [2-2]
        // new 생략하고 배열 사용 ~> 보통 이 방법이 간편해서 많이 사용
        int num2[] = {100, 200, 300};

        System.out.println(num2[0]); // 100
        System.out.println(num2[1]); // 200
        System.out.println(num2[2]); // 300

        // [2-4] String 배열
        String animals[] = {"Tiger", "Lion", "Elephant"};

        System.out.println(animals[0]); // Tiger
        System.out.println(animals[1]); // Lion
        System.out.println(animals[2]); // Elephant

    }
}
