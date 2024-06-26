package Section14;

import java.util.HashSet;
import java.util.Objects;

public class Se14Collection05 {
    public static void main(String[] args) {
        // hashCode와 equals 메서드 재정의
        // 1. 두 객체의 해시코드 값 같게 만들기
        // 2. 2개 필드를 가지고 만들기
        // 3. Object 클래스 : hash() 메서드 사용해서 해시코드 생성하기
        //      - Object 클래스의 hash() 메서드는 임의의 개수를 매개값으로 받아 해시코드를 계산하여 반환해주는 정적 메서드
        //      - 이 메서드는 객체의 주소 값을 이용해서 해싱(hashing) 기법을 통해 해시 코드를 만든 후 반환
        //      - 직접 이러한 것을 구현하고 만들려면 복잡하기 때문에 제공하는 Objects.hash() 메서드를 사용하는 것을 권장
        //      - 해시코드 값은 기본적으로 객체의 주소 값을 이용해서 해시 코드를 생성
        //          (그러나, 객체의 필드를 이용해서 해시 코드를 생성할 수도 있음)
        //      - 이때는 hashCode() 메서드를 오버라이딩하여 객체의 필드를 Objects.hash() 인자로 넣어서 구현

        // 해시코드 : 객체의 내용을 베이스로 만들어진 객체 구분(인식)용 정수 값 ~> 식별자
        // - hashCode() 메서드 변환 타입 : int 타입을 반환
        // - 사용자 정의 객체인 경우 이것이 재정의(오버라이딩) 되어 있지 않으면 객체의 내용이 같음에도 같지 않은걸로 인식
        // - 따라서, 객체의 내용이 같다면 서로 같은 값으로 인식할 수 있도록 재정의가 필요
        // - 이때, hashCode() 메서드와 equals() 메서드 2개를 같이 재정의! -> 어디에다? -> Person 클래스에...
        
        // Person 객체 hashCode 값 출력
        Person05 p1 = new Person05("홍길동", 20);
        Person05 p2 = new Person05("홍길동", 30);

        System.out.println("p1 해시코드 값 : " + p1.hashCode());
        System.out.println("p2 해시코드 값 : " + p2.hashCode());

        // p1, p2 객체의 해시코드 값을 같게 만드는 방법은 ? -> Person05 클래스에 hashCode() 메서드 재정의 (오버라이딩) 
        // hashCode() 메서드 재정의 + equals() 메서드 재정의 : 이 두개의 메서드 재정의가 필요!

        // 다시 말해서, 컬랙션 프레임워크 클래스가 내부적으로 중복값 비교를 할 때 hashCode, equals 결과 값을 중요하게 참조!
        // 특히, 중복값을 허용하지 않는 클래스 사용 시 기억
        // 만약 컬랙션에서 사용하지 않고, 단지 equals 메서드만 재정의해서 사용하면 해시 코드가 틀려도 true가 출력
        System.out.println("p1 vs p2 해스코드 값이 같냐? : " + (p1.hashCode() == p2.hashCode()) );
        System.out.println("p1.equals(p2) 결과는 ? : " + p1.equals(p2));
        
        // HashSet 객체 생성
        HashSet<Person05> set = new HashSet<>();

        // Person05 객체 생성
        set.add(new Person05("Superman", 24));
        set.add(new Person05("Antman", 21));
        set.add(new Person05("Batman", 28));

        for(Person05 p : set){
            System.out.println(p);
        }
        
        System.out.println("------------------------------------");

        // 객체 추가하기
        set.add(new Person05("Batman", 28));
        set.add(new Person05("Batman", 38));
        set.add(p1);
        set.add(p2);

        for(Person05 p : set){
            System.out.println(p);
        }
        
    }
}

class Person05{
    String name;
    int age;

    Person05(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Person : {name : %s, age : %d}",
            this.name, this.age);
    }

    @Override
    public int hashCode(){
        // [1] 방식 : String의 hashCode() 메서드 사용
        // return this.name.hashCode() + this.age;

        // [2] 방식 : Objects.hash() 메서드 사용
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj){
        // [1]
        // if(obj instanceof Person05){
        //     Person05 p = (Person05) obj;
        //     return this.name.equals(p.name) && (this.age == p.age);
        // }else{ return false; }

        // [2] 삼항연산자 작성 
        return (obj instanceof Person05) ? 
            this.name.equals(((Person05)obj).name) && this.age == ((Person05)obj).age : false;
    }
}