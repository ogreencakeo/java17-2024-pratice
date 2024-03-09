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

    }
}
