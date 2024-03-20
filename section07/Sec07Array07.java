package section07;

public class Sec07Array07 {
    public static void main(String[] args) {
        int nums[][] = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        System.out.println(nums[2][2]); // 9 

        change2(nums[2]);
        System.out.println("change2 메서드 호출 후 결과는 ? => " + nums[2][2]); // 100
        
        change1(nums[2][2]);
        System.out.println("change1 메서드 호출 후 결과는 ? => " + nums[2][2]); // 30? 100?

    }

    public static void change1(int arr){
        arr = 30;
        System.out.println("arr 출력 => " + arr); // 30
    }

    public static void change2(int arr[]){
        System.out.println("arr[2] 출력 => " + arr[2]); // 7?8?9?
        arr[2] = 100;
    }
}
