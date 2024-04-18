package Section14;

import java.util.TreeMap;

public class Se14Collection11 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - Comparable 인터페이스를 구현하여 Person 클래스 객체 정렬하기
        
        // TreeMap 객체 생성
        TreeMap<UPerson, String> tmap = new TreeMap<>();
        tmap.put(new UPerson("홍길동", 40), "의적");
        tmap.put(new UPerson("김유신", 40), "의적");
        tmap.put(new UPerson("을지문덕", 40), "의적");
        tmap.put(new UPerson("강감찬", 40), "의적");

        // Person 객체를 요소로 추가 시 에러가 나는 이유는 ?
        // 1. "Comparable" 인터페이스 타입으로 캐스팅 할 수가 없다. 라는 오류 발생
        // 2. TreeMap은 key 값으로 Comparable 인터페이스를 구현한 타입만 사용 가능
        // 3. Person 클래스는 Comparable 인터페이스를 구현하지 않았기 때문에 key 값으로 사용 불가능
        // 4. 오류를 해결하려면 Person 클래스에 Comparable 인터페이스를 구현
    }
}

class UPerson implements Comparable<UPerson>{
    String name;
    int age;

    UPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Comparable 인터페이스 구현
    @Override
    public int compareTo(UPerson o) {
        return this.name.compareTo(o.name);
    }
}
