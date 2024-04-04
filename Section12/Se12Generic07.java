package Section12;

public class Se12Generic07 {
    public static void main(String[] args) {
        // 제네릭 메서드 (Generic Method)
        // - 흔히 "제네릭 메서드"라고도 부름
        // - 지금까지는 클래스 전체를 제네릭 문법으로 적용해서 만들었는데, 메서드에 대해서만 적용하는 것도 가능

        // - 메서드 선언부에 타입 파라미터를 선언하여 메서드의 매개변수와 리턴 타입으로 결정하게 하는 메서드
        // - 한다미로, 메서드 호출할 때 매개변수 타입과 리턴 타입을 결정하겠다... 라는 것

        // - 앞서 만들어 사용해왔던 일반 메서드하고 큰 차이는 X
        // - 먼저, 일반 메서드 만들고 ~> 이를 제네릭 메서드로 수정해보자.

        // 타입 결정
        // - 제네릭 클래스와 제니릭 메서드는 각각 T가 언제 결정이 되어지는가?
        //      1. 제네릭 클래스는 객체를 생성할 때 ~> T 타입을 결정
        //      2. 제네릭 메서드는 메서드를 사용할 때 ~> T 타입을 결정
        // - 제네릭 메서드 사용 시 인수의 타입을 생략하는 것도 가능

        // 장점
        // - 타입 안전성을 향상시킬 수 있다.
        // - 코드 작성을 간결하게 만들 수 있다.
        // - 코드의 재사용성을 높일 수 있다.

        // 다양한 타입의 값을 전달받는 제네릭 메서드를 만들어보시오.
        // 메서드에 전달된 값이 어떤 인스턴스인지 체크하는 메서드를 instanceof 이용해거 구현해보시오.
        
        // Integer
        boolean a = DataCheck.isInt(10.0);
        System.out.println("Integer 클래스의 인스턴스 인가요? : " + a);

        // Double
        boolean b = DataCheck.isDouble(3.14);
        System.out.println("Double 클래스의 인스턴스 인가요? : " + b);
        
        boolean c = DataCheck.isString('가');
        System.out.println("String 클래스의 인스턴스 인가요? : " + c);
    }
}

class DataCheck{
    public static boolean isInt(Object data) {return data instanceof Integer;}
    public static boolean isDouble(Object data) {return data instanceof Double;}
    public static boolean isString(Object data) {return data instanceof String;}
}