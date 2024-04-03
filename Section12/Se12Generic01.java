package Section12;
// 자바의 컬렉션 프레임워크(Collection Framework)나 제네릭(Generic) 등에서는 객체만 다루기 때문에 
// 기본 타입을 객체로 변환해야 할 때가 있습니다.
public class Se12Generic01 {
    public static void main(String[] args) {
        // 제네릭(Generic) 실습
        // - 정수형 값 또는 문자열 값을 전달하여 객체를 생성하고, 해당 타입의 정보를 출력하는 클래스를 만들어보시오.
        Integer foo = Integer.valueOf(100);
        String foo2 = "홍길동";

        Data d1 = new Data(foo);
        System.out.println(d1.getObj()); // 값 출력 // 100
        d1.PrintInfo(foo); // 타입 정보 출력 // java.lang.Integer
        
        Data2 d2 = new Data2(foo2);
        System.out.println(d2.getObj()); // 홍길동
        d2.PrintInfo(foo2); // java.lang.String

    }
}

class Data{
    // Field
    int obj;

    // Constructor
    Data(int obj){ this.obj = obj; }

    // Getter Method
    int getObj(){ return this.obj; }

    // PrintInfo Method
    void PrintInfo(Integer obj){
        // getClass() : 해당 객체의 클래스를 나타내는 Class 객체가 반환
        System.out.println(">> 타입 출력 : " + obj.getClass().getName());
    }
}

class Data2{
    String obj;
    Data2(String obj){ this.obj = obj; }
    String getObj(){ return this.obj; }
    void PrintInfo(String obj){
        System.out.println(">> 타입 출력 : " + obj.getClass().getName());
    }
}