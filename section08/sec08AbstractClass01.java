package section08;

public class Sec08AbstractClass01 {
    public static void main(String[] args) {
        // 추상 클래스(Abstract class) - 강제성을 지님
        // - 메서드 선언은 선언대로 하고, 구현은 구현대로 분리해서 만들자! -> 인터페이스까지 이어지는 과정
        
        // 객체 생성
        Student s1 = new Student("대학생", 20);
        System.out.printf("s1 객체 => name : %s, age : %d \n", s1.name, s1.age );
        s1.work();

        Nurse n1 = new Nurse("간호사", 25);
        System.out.printf("n1 객체 => name : %s, age : %d \n", n1.name, n1.age );
        n1.work();

        Fireman f1 = new Fireman("소방관", 30);
        System.out.printf("f1 객체 => name : %s, age : %d \n", f1.name, f1.age );
        f1.work();
    }
}

abstract class Person{
    // Field
    String name;
    int age;
    
    // Constructor
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    public abstract void work(); // 강제성 있음

    public void eat(){ 
        System.out.println("밥 먹고 있는 중...");
    }
}

class Student extends Person{
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    // 자식이 상속 받은 상태에서는 정상적이게 구현해야 함. -> 오버라이딩하여 사용해야함
    @Override // 어노테이션 ~> 애너 주석을 달다
    public void work() {
        System.out.println(name + " 공부하는 중");
    }
    
}

class Nurse extends Person{
    Nurse(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void work(){
        System.out.println(name + " 간호하는 중");
    }
}

class Fireman extends Person{
    Fireman(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void work(){
        System.out.println(name + " 불끄는 중 ");
    }
}