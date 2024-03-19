package Section06.ex01;

// 1. java.lang 패키지
//      - java.lang.Math 패키지가 기본 포함이라 사용 가능
//      - String, StringBuffer, Math, Wrapper (기본형을 객체로 다루기), System, Stream, ...
//      - 자바 프로그래밍에 필수적이고, 기본적인 클래스들이 들어있는 패키지
//      - import 키워드(예약어)로 가져와야 사용할 수 있는 다른 패키지들과는 달리 import 없이도 자동 포함

// 2. Math.PI
//      - 변수 X -> 그냥 바로 사용 O
//      - static 선언이 되어져 있겠구나.. 알 수 있음
//      - Math 클래스 -> public static final double PI = 3.14..... ; 상수로 정의
//      - final 은 상수를 의미 -> 값을 바꿀 수 없음
//      - System.out.println(Math.min(100, 50)); // 50
//      - System.out.println(Math.max(100, 50)); // 100

// 3. public vs private
//      - public -> private 변경하면 error

// 4. static은 메서드 뿐만 아니라 변수, 상수에도 붙일 수 있음
//      - Start.PI == Math.PI


public class App {
    public static void main(String[] args) {
        System.out.println("== Hi ===");

        // int class = 100;
        // System.out.println(class);

        System.out.println(Math.PI); // 항상 변하지 않는 수 : 상수
        System.out.println(Math.min(100, 50)); // 50
        System.out.println(Math.max(100, 50)); // 100

        // new Start().main();

        String greeting = "Hi~ ";
        Start.main(greeting);

        double pi = Math.PI;
        System.out.println(pi);

        System.out.println(Start.PI); // 3.14
        // Start 클래스에 public static final double PI에서 static을 지운다면
        // System.out.println(new Start().PI);
    }
}

class Start{
    public static final double PI = 3.14;
    // public static double PI = 3.14;
    
    // public void main(){
    public static void main(String str){
        System.out.println(str + "=== Start ===");
        // PI = 4.14;
    }
}
