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

        // 숫자 + 문자 연산 (★★★)
        // 숫자 위에 문자가 붙는데 홑따옴표냐 쌍따옴표냐에 따라서 결과가 달라질 수 있다.
        // 홑따옴표 문자가 붙었을때 계산이 된다? -> 그럼 홑따옴표 문자(char)은 숫자로 취급이 된다는 뜻인가 ? (유추)
        // 결론 ~> char 타입에 대해서 좀 더 알아야 한다. (정수형 타입)

        // ◆ char ~> 넌 정체가 뭐냐?
        // - 사실 char 타입은 정수형 타입에 속한다. -> 커밍아웃 수준 -> 그래서 'b' + 24 = 122가 나옴
        // - 하나의 문자를 홑따옴표(작은따옴표)로 감싼 문자 -> 문자 리터럴 (literal : 문자 그대로의)
        // - 이러한 문자 리터럴은 자바 내부에서는 숫자(유니코드)로 변환되어 저장 -> 자바는 유니코드 기반임
        // - 알파벳 대소문자 시작인 A, a 정도는 암기하면 좋음 
        // -> A(65), B(66) ... Z(90)
        // -> a(97), b(98) ... z(122)
        // - K : 75, ㄱ : 12593(유니코드 변환기 이용하면 쉽게 알아낼 수 있음)

        // [2]
        // 유니코드에 대해서
        //  - 아스키 코드 이후에 세계각국의 문자를 2byte로 표현할 수 있도록 매핑한 국제 표준 약속
        //  - 아스키 코드란?
        //      - ASCII : 영문 알파벳을 사용하는 대표 문자 인코딩
        //      - 문자에 대해서 각각 번호를 매겨서 숫자로 관리하는 코드표(집합체)
        //      - American Standard Code for Information Interchange;
        //  - 인코딩이란?
        //  - encode : 암호로 바꾸다; 부호화하다; 표현하다
        char c1 = 'A'; // 65
        System.out.println(c1); // A
        System.out.println(c1 + 100); // 165
        System.out.println((int)c1); // 65

        char c2 = 'a'; // 97
        System.out.println(c2); // a
        System.out.println(c2 + 100); // 197
        System.out.println((int)c2); // 97

        String c3 = "A";
        System.out.println(c3); // A
        // System.out.println((int)c3); // error
        System.out.println(c3 + 100); // A100

        char c4 = 65, c5 = 97;
        System.out.println(c4); // A
        System.out.println(c5); // a
        System.out.println((int)c4); // 65
        System.out.println((int)c5); // 97

        // [3]
        // 연습문제
        char a1 = 'A';
        char a2 = 65;
        System.out.println("a1 : " + a1); // A
        System.out.println("a1 : " + a2); // A
        System.err.println(a1 + a2); // 130

        // 10진수 65로 저장하지 않고, 16진수 방식으로 저장을 해도 역시 대문자 A가 출력
        char a3 = '\u0041', a4 = '\u0061';
        System.out.println(a3); // A
        System.out.println(a4); // a

        // 아래 출력 결과를 말해보시오
        char a5 = 'Z'; //65+25 = 90
        System.out.println(a5 + 25); // 115
        System.out.println(a5); // Z

        char b1 = 'A' + 10; // 65 + 10 = 75 = K
        System.out.println('A' + 1); // 66
        System.out.println(b1); // K

        char a7 = 'K';
        System.out.println("a7 + 25 계산 결과는 ? :" + a7 + 25); // K25
    }
}
