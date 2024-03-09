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
        System.out.printf("값 "+ c + "를 " + d + "으로 나누기하면 몫은 %f이고, 나머지는 %f이다.", c/d, c%d);
    }
}
