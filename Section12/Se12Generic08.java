package Section12;

public class Se12Generic08 {
    public static void main(String[] args) {
        // 제니릭 메서드 (Generic Method) 만들기
        //      <T>         제네릭 타입
        //      T           리턴 타입
        //      T param     매개변수 타입

        // 다양한 타입의 값을 전달받는 제네릭 메서드를 만들어보시오.
        // 메서드에 전달된 값이 어떤 인스턴스인지 체크하는 메서드를 instanceof 이용해서 구현해보시오.
        DataCheck2.<Integer>showData(100); // Integer Type
        DataCheck2.<Double>showData(3.14); // Double Type
        DataCheck2.<String>showData("Korean"); // String Type
        DataCheck2.<Character>showData('가'); // Character Type

        // 타입 생략 가능
        System.out.println("-------------------------");
        DataCheck2.showData(10.15);
        DataCheck2.showData(1000);
        DataCheck2.showData("가나다라");
        DataCheck2.showData('A');

        Integer intX1 = DataCheck2.showData(200);
        System.out.println("intX1 : " + intX1);
    }
}

class DataCheck2{
    // 제네릭 메서드 만들기
    public static <T> T showData(T data){ 
        // if 조건문
        if(data instanceof Integer) System.out.println("Integer Type");
        else if(data instanceof Double) System.out.println("Double Type");
        else if(data instanceof String) System.out.println("String Type");
        else if(data instanceof Character) System.out.println("Character Type");

        return data;
    }
}
