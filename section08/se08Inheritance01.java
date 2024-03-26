package Section08;

public class Se08Inheritance01 {
    public static void main(String[] args) {
        // 상속
        // - 프로그램의 시작점인 main 메서드에서는 자식 객체를 생성하는 코드 작성
        // - 부모 클래스, 자식 클래스를 별도의 클래스로 각각 만들어 놓고 상속을 구현하여 실행
    
        // 자식 객체 생성 -> 인자가 없는 값들은 초깃값으로 셋팅
        Child c1 = new Child("홍길동", 22, "홍"); 
        c1.printInfo(); // 이름은 홍길동, 나이는 22, 키는 0.000000 cm, 몸무게 0.000000 kg입니다.

        c1.height = 180.5;
        c1.weight = 85.5; // 이름은 홍길동, 나이는 22, 키는 180.50cm, 몸무게 85.50kg입니다. 
        c1.printInfo();
        c1.work(); // 홍 객체는 일하는 중입니다.

        Parent p1 = new Parent();
        p1.printInfo(); // 이름은 null, 나이는 0, 키는 0.00cm, 몸무게 0.00kg입니다.
    }
}

class Parent{
    // Field
    String name;
    int age;
    double height;
    double weight;

    // Constructor (없으면 디폴트 생성자 생성 -> 객체 생성시 묵시적 호출)

    // Method
    public void printInfo(){
        System.out.printf("이름은 %s, 나이는 %d, 키는 %.2fcm, 몸무게 %.2fkg입니다.\n", name, age, height, weight);
    }
}

class Child extends Parent{
    // Field
    String nickName;

    // Constructor
    Child(String name, int age, String nickName){
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }
    
    // Method
    // 부모 클래스에는 없는 자식 클래스만의 속성(필드), 기능(메서드)를 새롭게 추가
    public void work(){
        System.out.println(nickName + " 객체는 일하는 중입니다.");
    }
}
