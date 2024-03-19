package section07;

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
        String str[];         // 배열 선언
        str = new String[3];   // 문자열 몇 개를 할당할 것인지를 설정

        str[0] = "Superman";
        str[1] = "Batman";
        str[2] = "Antman";

        System.out.println(str[0]); // Superman
        System.out.println(str[1]); // Batman
        System.out.println(str[2]); // Antman
        System.out.println(str[2] = "Ironman"); // Ironman
        // System.out.println(str[3] = "Wonderwoman"); // Error
    }
}
