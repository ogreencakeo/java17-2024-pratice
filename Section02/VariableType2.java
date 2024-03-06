package Section02;

public class VariableType2 {

    public static void main(String[] args) {
        
        /* 
         * 기준이 되는 주요 타입별 값 출력해보기
         * int, double, char, String, boolean
         * 
         */
    
        // 변수 선언
        int a;
        double b;
        char c;
        String d;
        boolean e;
    
        // 선언한 변수에 초깃값 셋팅 (할당)
        a = 100;
        b = 3.14;
        c = 'A';
        d = "Korea";
        e = true;

        // 출력
        System.err.println(a);
        System.err.println(b);
        System.err.println(c);
        System.err.println(d);
        System.err.println(e);

        // 변수 선언과 동시에 초깃값 셋팅
        int a2 = 100;
        double b2 = 3.14;
        char c2 = '에';
        String d2 = "에이";
        boolean e2 = false;

        // 출력
        System.err.println(a2);
        System.err.println(b2);
        System.err.println(c2);
        System.err.println(d2);
        System.err.println(e2);

        // 틀린거 찾기
        
        // int num; 
        // num = 10.0; (x) -> num = 10

        // String s = 'abc'; (o)

        // boolean b = 'true'; (x) -> true

        // char c = '가'; (o)

        // int num1, int num2; (x) -> int num1, num2

        // int a1, double a2 = 10.0; (x) -> double a1, a2 = 10.0;

        // int x, y; (o)

        // int n = 100; 
        // char n = 'x'; (x) -> char m
        
        // int x1 = 0;
        // int y1 = x1 + 1.0; (x) -> x1 + 10
        
        // double d1 = 3.14;
        // int d2 = d1; (x) -> int

        // 형변환
        double d1 = 3.14;
        int d12 = (int) d1; // 강제 형 변환 -> 3.14에서 3만 할당
        System.err.println(d12);

    }

}
