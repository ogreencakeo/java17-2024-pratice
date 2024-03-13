package section05;

public class Sec05For02 {
    public static void main(String[] args) {
        /*
         * 1. for 반복문 vs while 반복문
         * - 보통 반복의 횟수를 명확히 알고 있을 때
         *  -> for, 아니면 while (다 그런 것은 아님)
         * - 일반적으로 반복을 시작하기 전에 루프 바깥에서 변수가 초기화 되어져 있다면 -> while 문이 좀 더 고려↑
         * 
         * 2. 조건에 대해서
         * - while 문은 조건이 참(true)인 동안 계속 반복을 수행
         * ~> true를 조건식에 넣어서 많이 사용 (false가 되면 중단)
         *      ★ 조건이 참인 동안 계속 수행
         * - for 문은 주어진 (또는 정해진) 조건 동안만 반복을 수행
         *      ★ 조건 동안만 계속 수행 / 배열과 함께 많이 사용
         * 3. true, false, 1
         * - 일반적으로 프로그래밍 세계에서는 1 ~> true, 0 ~> false (다 그런것은 아님)
         * - true 사용 ~> for, while 모두 가능 (보통 while 문에서 많이 사용하고 for문에서는 잘 사용하지 않는다.) while(true)
         * - 1 사용 ~> 다른 프로그래밍 언어에서는 while(1) 이렇게 사용도 하지만, 자바에서는 명시적인 논리값을 사용 ~> while(true)
        */

        // [1] true 사용
        // 1 ~ 10 반복 출력해서 for 조건식에 true 사용하면 ? -> 무한루프 (중단은 ctrl + c)
        // 조건식 자체를 그냥 비워두는 것도 가능 -> 조건이 없다? -> 무한 루프
        // 그냥 1 쓰는 것은 안된다.
        // for(int i=0; i<10; i++){
        //     System.out.println(i);
        // }

        // while(true) {
        //     System.out.println('1');
        // }

    }
}
