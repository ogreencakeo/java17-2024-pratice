package Section14;

public class Se14Collection03 {
    public static void main(String[] args) {

        //  항상 새로운 객체를 힙(heap) 영역에 생성함.
        // new를 사용하여 객체를 생성하면 해당 객체는 고유한 메모리 주소를 가지게 됨.

        // Person 객체 생성 => 재정의 전후 비교
        TPerson p1 = new TPerson("Superman");
        TPerson p2 = new TPerson("Superman");
        
        // String p1 = new String("Superman");
        // String p2 = new String("Superman");
        
        // String 리터럴로 생성한 경우
        // String p1 = "Superman";
        // String p2 ="Superman";

        // p1, p2 객체(참조) 변수 값 출력
        // toString() 메서드 사용 : 패키지명.클래스명@16진수 값
        System.out.println(p1.toString()); // Section14.TPerson@24d46ca6 => hashcode값
        System.out.println(p2.toString()); // Section14.TPerson@4517d9a3 => hashcode값
        
        // hashCode 값 출력 (int 타입)
        // 기본적으로 new 키워드를 사용하여 생성한 객체는 서로 다른 객체이므로 다른 hashCode를 갖음.
        // 하지만 String 리터럴은 문자열이 같다면 같은 객체를 참조하므로 hashCode 값이 같음.
        System.out.println(p1.hashCode()); // 617901222
        System.out.println(p2.hashCode()); // 1159190947

        // 주소 비교
        System.out.println("p1 == p2 결과는? : " + (p1==p2)); // false // String 에서는 true

        System.out.println("p1.equals(p2) 결과는? : " + (p1.equals(p2))); // false // new String에서는 true (String의 equals 메서드는 문자열 내용을 비교)

        // 위에서 617901222 해시코드 정수값이 곧 24d46ca6(16진수) 값이다.
        // hashCode 값 16진수로 출력하기 : Integer.toHexString()
        System.out.println(Integer.toHexString(617901222)); // 24d46ca6
        System.out.println(Integer.toHexString(p1.hashCode())); // 24d46ca6
    }
}

class TPerson{
    String name;

    public TPerson(String name){this.name = name;}

    // 재정의
    @Override
    public boolean equals(Object obj){
        return this.name.equals(((TPerson)obj).name);
    }
}