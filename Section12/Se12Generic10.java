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
        System.out.println(c); // a
    }
}

class MyDataCheck{
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