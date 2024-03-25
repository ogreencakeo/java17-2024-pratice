package section08;

public class sec08AbstractClass01 {
    public static void main(String[] args) {
        // 추상 클래스(Abstract class) - 강제성을 지님
        // - 메서드 선언은 선언대로 하고, 구현은 구현대로 분리해서 만들자! -> 인터페이스까지 이어지는 과정
        
        // 객체 생성
        Student s1 = new Student("대학생", 20);
        s1.eat(); // 오버라이딩
        System.out.println(s1.name); // 대학생
        System.out.println(s1.age); // 20

        Nurse n1 = new Nurse("간호사", 25);
        n1.eat();
        
    }
}

class Person{
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
    public void eat(){
        System.out.println(name + "이(가) 밥 먹고 있는 중...");
    }
}

class Nurse extends Person{
    Nurse(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    public void eat(){
        System.out.println(name + "이(가) 밥 먹고 있는 중...");
    }
}