package Drill;

public class Drill_0202 {
    public static void main(String[] args) {
        // [1]
        // 아래 10문제의 출력 결과를 말해보시오.
        int b = 100;
        System.out.println(b + 100); // 198 -> 200
        System.out.println(b + "100"); // 100100
        System.out.println(b + 'K'); // 175
        System.out.println('K' + b); // 175
        System.out.println(b + "K"); // 100K
        System.out.println('K'); // K
        System.out.println("K"); // K
        // ㄱ - 12593
        System.out.println(b + 'ㄱ'); // 12693
        System.out.println(b + "ㄱ"); // 100ㄱ
        System.out.println('b' + 24); // 122
        System.out.println('b' + b); // 198
        
    }
}
