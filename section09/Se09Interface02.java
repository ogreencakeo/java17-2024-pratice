package Section09;

// 인터페이스 실습2
// - 동물 클래스를 통해서 동물이 가질 수 있는 공통의 특성을 추상화하여 정의하시오.
// - 동물 하위의 클래스를 정의하시오. (ex : 포유류, 조류, 파충류, 양서류...)
// - 원숭이 클래스를 만들어보시오.
//      이때, 원숭이에게 공격 기능을 부여해주고 싶은데 어떻게 하면 할 수 있을지 고민해보시오

// 부연 설명
// - 다른 방법도 있겠지만, 추상 클래스와 인터페이스를 이용하여 구현한다.

public class Se09Interface02 {
    public static void main(String[] args) {

        // 원숭이 객체 생성
        Monkey monkey1 = new Monkey("포유류", "원숭이");
        monkey1.breed();
        monkey1.eat();
        monkey1.sleep();
        monkey1.move();
        monkey1.tail();
        monkey1.spit();

        System.out.println();

        // 독수리 객체 생성
        Egal egal1 = new Egal("조류", "독수리");
        egal1.fly();
        egal1.eat();
        egal1.sleep();
        egal1.move();
        egal1.spit();
    }
}

// 동물
abstract class Animal0902{
    String name;
    String group;

    abstract void eat();
    abstract void sleep();
    abstract void move();
    // 추상 클래스를 통해서 동물이 가질 수 있는 공통의 특성을 추상화
    // - 이렇게 정의하면 이제 Animal 추상 클래스는 인스턴스(객체)를 직접 생성할 수는 없다. -> 드러나, 타입으로써의 의미는 O
}


// 특정 공격 기능을 원숭이 클래스에 추가하고 싶다면 => interface 사용
// public 제외하고 작성, 추상 메서드에서 public abstract 생략 가능
interface TailAttack{ void tail(); }
interface SpitAttack{ void spit(); }

// 포유류
abstract class Mammal extends Animal0902{

    abstract void breed();

    // @Override
    // void eat(){}
    // @Override
    // void sleep(){}
    // @Override
    // void move(){}
}

// 조류
abstract class Birds extends Animal0902{
    abstract void fly();
}

// 원숭이
class Monkey extends Mammal implements TailAttack, SpitAttack{

    // Constructor
    Monkey(String group, String name){
        this.group = group;
        this.name = name;
    }

    // Method 
    // 각각의 추상 메서드를 원숭이에 맞게끔 재정의해서 사용
    @Override
    void breed(){
        System.out.printf(">> %s %s가 새끼를 낳고 있습니다.\n", this.group, this.name);
    }

    @Override
    void eat(){
        System.out.printf(">> %s %s가 먹고있습니다.\n", this.group, this.name);
    }

    @Override
    void sleep(){
        System.out.printf(">> %s %s가 잠을 자고 있습니다.\n", this.group, this.name);
    }

    @Override
    void move(){
        System.out.printf(">> %s %s가 이동하고 있습니다.\n", this.group, this.name);
    }

    // 인터페이스 오버라이딩
    @Override
    public void tail(){
        System.out.printf(">> %s %s 꼬리로 공격\n", this.group, this.name);
    }

    @Override
    public void spit(){
        System.out.printf(">> %s %s 침뱉기 공격 투~\n", this.group, this.name);
    }
}


// 독수리
class Egal extends Birds implements SpitAttack{
    // Constructor
    Egal(String group, String name){
        this.group = group;
        this.name = name;
    }
    @Override
    void fly(){
        System.out.printf(">> %s %s가 날고 있습니다.\n", this.group, this.name);
    }

    @Override
    void eat(){
        System.out.printf(">> %s %s가 날개짓을 하면서 먹고 있습니다.\n", this.group, this.name);
    }

    @Override
    void sleep(){
        System.out.printf(">> %s %s가 나뭇가지에 매달고 자고 있습니다. \n", this.group, this.name);
    }

    @Override
    void move(){
        System.out.printf(">> %s %s가 땅위로 이동하고 있습니다.\n", this.group, this.name);
    }

    // interface 메서드 오버라이딩
    @Override
    public void spit(){
        System.out.printf(">> %s %s 침뱉기 공격 퉤! \n", this.group, this.name);
    }
}