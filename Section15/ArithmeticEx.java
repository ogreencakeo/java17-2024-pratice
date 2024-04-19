package Section15;

public class ArithmeticEx {
    public static void main(String[] args) {
        // 산술적 예외 발생
        int a = 10;
        int b = 0;

        // 모든 수는 0으로 나눌 수가 없다.
        int c = a / b;
        System.out.println(c);
    }
}
