package Section03;

public class Sec03Operator03 {
    public static void main(String[] args) {
        /*
         * 평균 구해서 출력하기
         * - 다양한 출력 형태 실습 + 사용자 입력 등을 배워서 적용하면 조금씩 확장 (파일 처리도)
         * - 평균을 쉽게 구해주는 함수도 있음
         */
        int no1 = 100;
        int no2 = 100;
        int no3 = 92;
    
        // 과목 총점
        int sum = no1 + no2 + no3;
    
        // 평균 계산
        double avg1 = sum / 3;
        double avg2 = sum / 3.0;
        double avg3 = (double) (sum / 3);
        double avg4 = (sum / (double) 3);
    
        // Question. 하단에 위 평균들을 계산한 출력 값을 말해보시오.
        System.out.println("avg1 : " + avg1 ); // 97.0
        System.out.println("avg2 : " + avg2 ); // 97.333333333
        System.out.println("avg3 : " + avg3 ); // 97.0
        System.out.println("avg4 : " + avg4 ); // 97.333333333

        System.out.println(22 / 3); // 7
        System.out.println(22 / 3.0); // 7.333333333333333
    }
}
