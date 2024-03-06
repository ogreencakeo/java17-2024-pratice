package Section02;

public class VariableType {
    public static void main(String[] args) {
        System.out.println("Hello, world");

        /* 숫자 */
        System.out.println(100);
        System.out.println();

        /* 연산 => 숫자 + 숫자 */
        System.out.println(100 + 100 * 100 + '\n'); // 10100

        /* 연산 => 변수 + 숫자 */
        int mathScore = 60;
        System.out.println(mathScore + 50); // 110

        /* 값 변경 => 변수 */
        int engScore = 90;
        engScore = 50;
        System.out.println(engScore); // 50

        /* 상수 (Constant) => 항상 변하지 않는 수
         * 끊임없는, 거듭되는, 변함없는
         * 상수는 선언 및 초기화 이후에 밑에서 값을 바꾸려면 그 순간 에러 표시
         * final 키워드 사용 -> 마지막으로 정한 값
         */
        // final int MAX_VALUE= 100;
        // MAX_VALUE = 200;
        // final double PI = 3.14;
        // PI = 3.141592;

        /*
         * 타입
         * 기준이 되는 것 -> 
         * 정수 (btye, short, int, long), 
         * 실수 (float, double),
         * 문자 (char),
         * 문자열 (String),
         * 불리언 (boolean)
         */
        long worldPopulation = 81123213224923L;
        System.err.println(worldPopulation);

    }
}
