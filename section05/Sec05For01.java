package section05;

public class Sec05For01 {
    public static void main(String[] args) {
        /*
         * for 반복문
         * - 반복의 횟수를 정확히 알고 있을 때 사용하면 편리
         * - 초기식; 조건식; 증감식;으로 구성
         * - 초기식은 최초 한번만 실행함
         * - 비기너 분들은 무엇보다 for 반복문의 실행 순서를 정확히 알고 있는게 중요하다
         * - 1~10까지 출력하는 것을 3가지 반복문으로 작성해보자
         * -> for, while, do...while
        */

        // 기본 틀
        /*
         * for(초기식; 조건식; 증감식;){
         *  /// ...조건이 맞는 동안 수행할 코드 작성
         * 
         * }
        */
        // 기본 예제
        // 0~9 까지의 반복 출력
        for(int i=0; i<=9; i++){
            System.out.println(i);
        }
    }
}
