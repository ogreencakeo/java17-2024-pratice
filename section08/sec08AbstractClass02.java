package section08;
public class sec08AbstractClass02 {
    public static void main(String[] args) {
        // 추상 클래스 - 연습문제
        // - Animal 부모 클래스와 Dog, Cat, Cow 등의 자식 클래스 사이에서 상속 구현을 추상 클래스로 구현해보시오.
        // - 먼저, 추상화 과정을 통해서 자식 객체가 가질 수 있는 공통의 특성(기능, 동작)을 생각해보자!
        // - 자식 객체들이 공통의 특성을 가지면서 자기만의 고유한 특성을 보여주는게 무엇인지 생각해보고 말해보시오
        // eat(), sleep(), run() => 개, 고양이, 소, 돼지....

        // cry() -> 추상 메서드.. // 멍멍 야옹 음메 꿀꿀

        // 문제속의 문제
        // - super vs super() 차이점을 말하시오.
        // - super    : 부모, 자식 클래스 사이에서 변수, 메서드 이름이 똑같을 때 구분하기 위해 사용
        // - super()  : 자식 클래스에 있는 생성자에서 부모 클래스의 생성자를 호출할 때 사용
        Dog d1 = new Dog();
        d1.run();
        d1.a(); // 가나다111 // 부모클래스의 a 메서드

    }
}

abstract class  Animal {

    String abc = "111";
    public void run(){
        System.out.println("가나다" + abc);
    };

    void a() {run();}
}

class Dog extends Animal{
    String abc = "222";
    public void run(){
        System.out.println(abc); // 222
        System.out.println("마바사" + super.abc); // 마바사111
    };

    void a() {super.run();}
}

class Cat extends Animal{
}

class Cow extends Animal{
}