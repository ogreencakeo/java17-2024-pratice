package Section09;

public class Se09Interface09 {
    public static void main(String[] args) {
        // 디폴트 메서드에서 인터페이스내 추상 메서드 호출하기
        // 객체 생성
        B b = new B();
        C c = new C();

        // 스타트 출력
        System.out.println("b.startValue() => " + b.startValue()); // 1
        System.out.println("c.startValue() => " + c.startValue()); // 100

        // 해당 객체별로 인터페이스내 디폴트 메서드 호출
        System.out.println("---------------------------------");
        System.out.println("b.nextValue() => " + b.nextValue()); // 2
        System.out.println("c.nextValue() => " + c.nextValue()); // 101
        System.out.println("---------------------------------");

        // 인터페이스 내 정적 메서드 호출 ~> 인터페이스명.메서드명()
        System.out.println(A.maxValue()); // 1000
    }
}

interface A{
    int startValue();

    // default Method
    default int nextValue(){
        int result = startValue() + 1;
        return result;
    }

    // Static Method : 정적 메서드
    static int maxValue(){
        return 1_000;
    }
}

class B implements A{
    @Override
    public int startValue(){
        return 1;
    }
}

class C implements A{
    @Override
    public int startValue(){
        return 100;
    }
}