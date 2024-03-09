package Section03;

public class Sec03Operator01 {
    public static void main(String[] args) {
        /*
         * 나머지 연산자 -> %
         * 1. 나누는 수 (오른쪽 피연산자)로 0은 사용할 수 없다.
         * -> x ~> 10 % 0 (Error)
         * 2. 어디에다 써먹지 ?
         * -> 짝수, 홀수 판별(2로 나눈 나머지가 0 인지를 가지고 짝수, 홀수로 판별)
         * -> 배수 판정에도 활용 : 어떤 수를 7로 나눈 나머지가 0이면 7의 배수, 0 아니면 배수 X
         */
        System.out.println(291 / 3); // 97 ~> 97.0처럼 나오게 하려면?
        System.out.println(291 / 3.0); // 97.0

        System.out.println(292 / 3); // 97.333333333 -> 결과는 97
        System.out.println(292 / 3.0); // 97.333333333
        System.out.println(292.0 / 3); // 97.333333333
        System.out.println(292 / (double) 3); // 97.333333333
        System.out.println((double) 292 / 3); // 97.333333333

        // 나머지 값 출력하기
        System.out.println(10 / 3); // 3
        System.out.println(10 % 3); // 1
        System.out.println(10 % 8); // 2
        System.out.println(10 % 7); // 3
        // System.out.println(10 % 0); // error

        // Question 아래 출력 결과를 말해보시오.
        // 2번째 오는 수는 절대값으로 온다.
        System.out.println(10 % 6); // 4
        System.out.println(-10 % 6); // -4
        System.out.println(10 % -6); // 4
        System.out.println(-10 % -6); // -4
        System.out.println(292 % 3); // 1
        System.out.println(292 % -3); // 1
        /*
         * 나머지 연산자는 나누는 수로 0(제로)은 안되지만 '음수'는 가능
         * 이때 부호는 무시 ~-> 음수의 절댓값으로 연산이 수행
         */
    }
}
