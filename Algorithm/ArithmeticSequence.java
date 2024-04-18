package Algorithm;

// [?] 1부터 20까지의 정수 중 홀수의 합을 구하는 프로그램
// 1, 3, 5, 7, 9 ...... => 등차수열

// 등차수열(Aritmetic Sequence) : 연속하는 두 수의 차이가 일정한 수열

public class ArithmeticSequence {
    public static void main(String[] args) {
        // [1] Input
        int sum = 0;

        // [2] Process
        for(int i=1; i<=20; i++){ // 주어진 범위
            if(i % 2 != 0) sum+= i;
        }

        // [3] Output
        System.out.println("1부터 20까지의 합 : " + sum);
    }
}
