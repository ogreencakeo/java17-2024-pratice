package Section08;

public class Sec08AbstractClass03 {
    public static void main(String[] args) {
        // 객체 생성
        Dog2 d1 = new Dog2("강아지", 5);
        System.out.println(d1);
        d1.cry();

        Cat2 c1 = new Cat2("고양이", 2);
        System.out.println(c1);
        c1.cry();

        Cow2 cow1 = new Cow2("소", 5);
        System.out.println(cow1);
        cow1.cry();

    }
}


abstract class Animal2 {
    // Field
    String nickname;
    int age;
    String address = "경기도 성남시";

    // Constructor
    Animal2(){};
    Animal2(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }

    // Method
    public void sleep(){
        System.out.println("잠 자는 중....");
    }

    public abstract void cry();

    public String toString(){
        return "종류 : " + nickname + ", 나이 : " + age;
    }
}

class Dog2 extends Animal2{
    Dog2(String nickname, int age){
        super(nickname, age); // 생성자는 괄호
    }

    @Override
    public void cry(){
        System.out.println("멍멍!!");
    }
}

class Cat2 extends Animal2{
    Cat2(String nickname, int age){
        super(nickname, age); // 생성자는 괄호
    }

    @Override
    public void cry(){
        System.out.println("야옹~");
    }
}

class Cow2 extends Animal2{
    // Field
    String address = "서현동 동물 보호 센터";

    // Constructor
    Cow2(String nickname, int age){
        super(nickname, age); // 생성자는 괄호
    }

    // Method
    @Override
    public void cry(){
        System.out.println("음메~ !, 자식 주소 : " + address);
        System.out.println("음메~ !, 부모 주소 : " + super.address);
    }
}