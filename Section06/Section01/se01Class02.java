package Section06.Section01;

public class se01Class02 {
    public static void main(String[] args) {
        // 가장 기본적인 형태의 Person 클래스를 만들어보시오.
        // 지금 여기는 프로그램 진입점 역할을 하는 main 메서드안이라는 것을 까먹지 말자.
        // 여기서는 주로 객체를 생성하여 사용하는 코드를 작성
        new Person();
    }
}

class Person{
    // Member Field (멤버 변수, 필드 -> 클래스 변수, 인스턴스 변수)
    // Attribute (속성)
    String name;
    String email;
    int age;

    // Constructor (생성자)
    // 객체가 생성되는 그 순간에 ~> 자동으로 제일 먼저 호출되어 실행되는 함수(메서드)
    // 생성되는 해당 객체에게 필요한 속성(필드) 값들을 만들고, 객체의 초기화를 담당
    // Person(){}; // 이렇게 클래스명과 이름이 똑같고 매개변수 받는게 없는 생성자 함수 -> 디폴트 생성자
    
    // 이 디폴트 생성자 조차도 안쓰고 작성하는게 가능
    // 생성자가 클래스내에 하나도 없다면 내용없는 디폴트 생성자가 기본 제공되는 것과 마찬가지

    Person(){

    }

    // Method (함수, 메서드)
    public void walk(){
        System.out.println("걸어갑니다.");
    }
}
