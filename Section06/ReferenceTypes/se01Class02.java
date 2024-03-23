package Section06.ReferenceTypes;

public class se01Class02 {
    public static void main(String[] args) {
        // 참조 타입의 전달 - 배열 객체
        int nums[] = new int[]{1, 2, 3, 4, 5};
        System.out.println(nums[2]); // 3
        System.out.println();

        change2(nums[2]);
        System.out.println("change2 메서드 호출 후 결과는 ? => " + nums[2]); //
        
        change1(nums);
        System.out.println("change1 메서드 호출 후 결과는 ? => " + nums[2]); //


    }

    public static void change1(int[] arr){

    }

    public static void change2(int x){

    }
}
