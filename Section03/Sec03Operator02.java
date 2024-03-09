package Section03;

public class Sec03Operator02 {
    public static void main(String[] args) {
        /*
         * 정수(int) 데이터 중 어느 하나를 실수(double) 데이터로 바꿔주면
         * 결과도 double
         */
        /*
         * int sum = 292; // 3과목 총점
         * int average = sum / 3.0; // error
         * double average = sum / 3.0; // error
         */
        int sum = 292; 
        double average = sum / 3.0;
        double average2 = (double) sum / 3;
        System.out.println(average);
        System.out.println(average2);

        /*
         * 몫과 나머지 출력하기 (printf 사용)
         */
        int a = 292;
        int b = 3;
        System.out.printf("값 "+ a + "를 " + b + "으로 나누기하면 몫은 %d이고, 나머지는 %d이다.", a/b, a%b);
        
        int c = 291;
        double d = 3;
        System.out.println(c / d);
        System.out.printf("값 "+ c + "를 " + d + "으로 나누기하면 몫은 %f이고, 나머지는 %f이다.\n", c/d, c%d);
    
        /*
         * 증감 연산자 -> ++, -- (단항 연산자 ~> !)
         *
         */
        boolean isBatman = true;
        System.out.println(isBatman); // true
        System.out.println(!isBatman); // true

        int count = 0;
        System.out.println("현재 count 값은? " + count++); // 0
        // 1..?? -> 결과는 0 (주의가 필요)
        // count 값은 증가된 상태이므로 그냥 아래에서 출력하면 1로 출력
        // -- 인 경우도 마찬가지
        System.out.println(count); // 1

        System.out.println("현재 count 값은? " + ++count); // 2
        System.out.println(count); // 2

        // '현재 카운터 값은 ?' 출력과 동시에 1 증가된 값을 콘솔에 나타나게 하려면?
        // ++ 증가 연산자를 변수 앞쪽에 선언
    }
}
