package Section07;

public class Sec07Array06 {
    public static void main(String[] args) {
        // 참조 타입의 전달 - 배열 객체
        int nums[] = new int[]{1, 2, 3, 4, 5};
        System.out.println(nums[2]); // 3
        
        change2(nums[2]);
        System.out.println("change2 메서드 호출 후 결과는 ? => " + nums[2]); // 3

        change1(nums);
        System.out.println("change1 메서드 호출 후 결과는 ? => " + nums[2]); // 30

    }

    public static void change1(int[] arr){ // 참조타입 : 주소값 전달
        arr[2] = 30;
        System.out.println("arr[2] 출력 => " + arr[2]); // 30
    }

    public static void change2(int arr){ // 기본형 타입 int : 복사
        System.out.println("arr 출력 => " + arr); // 3
        arr = 100;
        System.out.println("arr출력 => " + arr); // 100
    }
}
