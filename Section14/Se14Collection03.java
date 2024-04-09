package Section14;

public class Se14Collection03 {
    public static void main(String[] args) {
        // Person 객체 생성
        TPerson p1 = new TPerson("Superman");
        // TPerson p2 = new TPerson("Batman");
        TPerson p2 = new TPerson("Superman");

        // p1, p2 객체(참조) 변수 값 출력
        // toString() 메서드 사용 : 패키지명.클래스명@16진수 값
        System.out.println(p1.toString()); // Section14.TPerson@24d46ca6 => hashcode값
        System.out.println(p2.toString()); // Section14.TPerson@4517d9a3 => hashcode값
        
        // hashCode 값 출력 (int 타입)
        // 기본적으로 new해서 생성시킨 객체들은 설령 같은 값으로 생성했어도 서로 다른 객체이다
        // 즉, hashCode 값이 다르다.
        System.out.println(p1.hashCode()); // 617901222
        System.out.println(p2.hashCode()); // 1159190947

        // 주소 비교
        System.out.println("p1 == p2 결과는? : " + (p1==p2)); // false
        System.out.println("p1.equals(p2) 결과는? : " + (p1.equals(p2))); // false

        // 위에서 617901222 해시코드 정수값이 곧 24d46ca6(16진수) 값이다.
        // hashCode 값 16진수로 출력하기 : Integer.toHexString()
        System.out.println(Integer.toHexString(617901222)); // 24d46ca6
        System.out.println(Integer.toHexString(p1.hashCode())); // 24d46ca6
    }
}

class TPerson{
    String name;

    public TPerson(String name){this.name = name;}

}