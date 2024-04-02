package Setion12;

public class Se12Generic02 {
    public static void main(String[] args) {
        // 제네릭(Generic) 실습
        // - 정수형 값 또는 문자열 값을 전달하여 객체를 생성하고, 해당 타입의 정보를 출력하는 클래스를 만들어보시오.
        Integer foo = Integer.valueOf(100);

        Data1 d1 = new Data1(foo);
        // Data1 d1 = new Data1("대한민국");
        
        // getObj() 메서드는 Object 타입을 반환합니다. 
        // 따라서 이 메서드를 호출한 결과를 Integer 타입의 변수에 직접 대입할 수 없습니다.
        Integer a = (Integer) d1.getObj();
        System.out.println(a); // 값 출력 => 100
    }
}

class Data1 {
    // Field
    Object obj;

    // Constructor
    Data1(Object obj) {
        this.obj = obj;
    }

    // Getter Method
    Object getObj() {
        return this.obj;
    }

    // PrintInfo Method
    void PrintInfo(Object obj) {
        // getClass() : 해당 객체의 클래스를 나타내는 Class 객체가 반환
        System.out.println(">> 타입 출력 : " + obj.getClass().getName());
    }
}
