package Section12;

public class Se12Generic10 {
    public static void main(String[] args) {
        // 제니릭 메서드 만들기 - 두 개의 값 중에서 작은 값 반환하기
        // -T 타입의 변수에 비교 연산자를 사용해야 하는 것이 핵심 포인트
        
        // 메서드 호출
        int i = MyDataCheck.min(100, 200);
        System.out.println(i); // 100

        double d = MyDataCheck.min(3.14, 5.14);
        System.out.println(d); // 3.14

        char c = MyDataCheck.min('a', 'A');
        System.out.println(c); // A

        System.out.println("--------------------------");

        // 제너릭
        int i2 = MyDataCheck.minGenericFn(100, 200);
        System.out.println(i2);
        
        Double d2 = MyDataCheck.minGenericFn(3.14, 5.14);
        System.out.println(d2);
        
        char c2 = MyDataCheck.minGenericFn('a', 'A');
        System.out.println(c2);

        // String 데이터(문자열)를 보내도 제네릭 기반을 만들었기 때문에 바로 사용이 가능
        // 이유는 String 클래스는 Comparable 인터페이스를 구현했기 때문에
        String s = MyDataCheck.minGenericFn("사", "랑");
        System.out.println(s);
    }
}

class MyDataCheck{

    public static <T extends Comparable<T>> T minGenericFn(T x, T y){
        return (x.compareTo(y) < 0)? x: y;
    }

    public static int min(int x, int y){
        return (x > y)? y : x;
    }
    
    public static double min(double x, double y){
        return (x > y)? y : x;
    }
    
    public static char min(char x, char y){
        return (x > y)? y : x;
    }
}

// 안타깝게도 T 타입의 변수에는 비교 연산자, 산술 연산자를 사용할 수 없다.
// 비교 연산자를 사용할 수 없다면, 어떻게 비교를 하지? ~> T 타입은 Comparable 인터페이스를 구현한 타입으로 제약
// 기본 데이터를 포함한 String 클래스 등은 이를 구현하고 있다.
// <T extends Comparable<T>> T(리턴타입) min(T x, T y) 이러식으로 저장