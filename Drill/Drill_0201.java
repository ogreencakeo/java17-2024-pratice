package Drill;

public class Drill_0201 {
    public static void main(String[] args) {
        /*
         * 유니코드 (아스키코드) 관련한 문제
         * - 비기너들에게는 상당히 까다롭게 느껴지는 영역
         * - 이런 영역들이 몇몇 있는데 진법변환, 유니코드, 아스키코드 관련, 연산자 축약...
         * - 코딩테스트, 기초 알고리즘 문제 등을 풀 때 이러한 개념이 없으면 아예 감도 못잡을 수 있음.
         */

         // [1]
         // 아래 10문제의 출력 결과를 말해보시오.
        int b = 100;
        System.out.println(b + 100); // 200
        System.out.println(b + "100"); // 100100
        System.out.println(b + 'K'); // 175
        System.out.println('K' + b); // 175
        System.out.println(b + "K"); // 100K
        System.out.println('K'); // K
        System.out.println("K"); // K
        System.out.println(b + 'ㄱ'); //12693
        System.out.println(b + "ㄱ"); // 100ㄱ
        System.out.println('b' + 24); // 122
        System.out.println('b' + b); // 198
        System.out.println();
    }
}
