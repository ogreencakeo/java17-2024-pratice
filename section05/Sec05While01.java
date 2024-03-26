package Section05;

public class Sec05While01 {
    public static void main(String[] args) {
        
        //   while 반복문
        //   - 조건을 먼저 비교하는 반복문
        //   - 조건에 true 를 넣어서 무한 반복 -> 종료할 수 있는 조건이 필요
        //   - 반복문 바깥쪽에 초기값을 하나 설정해놓고 반복 start~
        //   - 반복을 한 번 수행할 때마다 초깃값을 증감시킨 후 다시 조건으로 올라가서 비교
        

        // 기본 틀
        /*
         * 초기식;
         * while(조건식) {
         *      // ...
         *      증감식;
         * }
         */

         // 기본 예제
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++; // i 값 증가 후 다시 조건으로 올라가서 비교
        }
    }
}
