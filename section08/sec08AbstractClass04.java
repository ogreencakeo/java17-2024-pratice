package section08;

public class sec08AbstractClass04 {
    public static void main(String[] args) {
        // 추상 클래스 - 연습문제
        // - 추상 클래스 내 추상 메서드의 접근 제한자를 private으로 바꾸면 어떤 일들이 벌어지는지 말해보시오.
        // - 오류가 난다 ? 안난다? 어떻게 되는지 말해보시오.
        // - 만약, 오류가 난다면 어떻게 해결을 해줘야 하는지도 말해보시오.
        // -> 오류가 난다. 
        // -> public or protected로 변환해줘야 한다. (protected는 상속관계이면 접근이 가능)
        // -> 아니면 완전한 상태로 메서드로 만들어준다. private void cry();

        // 객체 생성
        Dog3 d1 = new Dog3("강아지", 5);
        System.out.println(d1);
        d1.cry();

        Cat3 c1 = new Cat3("고양이", 2);
        System.out.println(c1);
        c1.cry();

        Cow3 cow1 = new Cow3("소", 5);
        System.out.println(cow1);
        cow1.cry();

    }
}


abstract class Animal3 {
    // Field
    String nickname;
    int age;
    String address = "경기도 성남시";

    // Constructor
    Animal3(){};
    Animal3(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }

    // Method
    public void sleep(){
        System.out.println("잠 자는 중....");
    }

    // 추상메서드
    protected abstract void cry();

    public String toString(){
        return "종류 : " + nickname + ", 나이 : " + age;
    }
}

class Dog3 extends Animal3{
    Dog3(String nickname, int age){
        super(nickname, age); // 생성자는 괄호
    }

    @Override
    public void cry(){
        System.out.println("멍멍!!");
    }
}

class Cat3 extends Animal3{
    Cat3(String nickname, int age){
        super(nickname, age); // 생성자는 괄호
    }

    @Override
    public void cry(){
        System.out.println("야옹~");
    }
}

class Cow3 extends Animal3{
    // Field
    String address = "서현동 동물 보호 센터";

    // Constructor
    Cow3(String nickname, int age){
        super(nickname, age); // 생성자는 괄호
    }

    // Method
    // 어노테이션을 붙여주지 않아도 큰 문제는 없다.
    // @Override
    public void cry(){
        System.out.println("음메~ !, 자식 주소 : " + address);
        System.out.println("음메~ !, 부모 주소 : " + super.address);
    }
}