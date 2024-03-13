package section05;

public class Sec05DoWhile01 {
    public static void main(String[] args) {
        /*
         * do ... while 반복문
         * - while 반복문과 비슷
         * - 차이점은 do 라는 단어가 앞에 나와있다는 것에서 알 수 있음
         * - 즉, 조건을 따지지 말고 '반복부터 해~' 라고 명령
         * - while 문은 조건을 먼저 비교하는데, do..while 문은 조건을 나중에 비교
         * - 따라서, 일단 반복문 바깥쪽에 선언한 초기값 변수가 한번은 실행
         * - 반복을 1회 수행하고 나서 조건을 비교하여 맞으면 다시 반복, 틀리면 반복 중단
        */

        // 기본 틀
        /*
         * 초기식;
         * do {
         *      // ...
         *      증감식;
         * }while(조건식)
        */

        // 기본 예제
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
}
