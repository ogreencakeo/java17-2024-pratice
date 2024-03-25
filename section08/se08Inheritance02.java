package section08;

public class se08Inheritance02 {
    public static void main(String[] args) {
        // 상속 (Inheritance)
        // - 부모 클래스와 자식 클래스 모두에 work 메서드가 있을 때 자식 객체가 work() 호출 시 어떻게 될까? 에러..?
        // - 에러나 충돌은 나지 않고 -> 자식 클래스의 work 메서드가 더 우선순위를 갖고 호출
        // - 그러나 자식 클래스에 work 메서드가 없다면 부모 클래스의 work 메서드가 호출이 됨
        // - 이러한 개념이 바로 -> 메서드 오버라이딩
        // - 앞에서 배운 메서드 오버로딩 개념과 헷갈리지 않도록 주의@
        Child0802 c1 = new Child0802("강감찬", 22, "강");
        c1.printInfo();
        c1.work();
        c1.work("안녕하세요~  저는 문자열입니다."); // 안녕하세요~ 저는 문자열입니다.
        c1.work(200, 300); // 부모클래스 x와 y : 200, 300
        // c1.work(100); 
    }
}

class Parent0802{
    // Filed
    String name;
    int age;

    // Constructor
    Parent0802(){}

    public void printInfo(){
        System.out.printf("이름 : %s, 나이 : %d \n", name, age);
    }

    // Method
    public void work(){
        System.out.println(name + " 일하는 중....");
        System.out.println("부모 클래스의 work 메서드 호출");
    }

    public void work(int x, int y){
        System.out.printf("부모클래스 x와 y : %d, %d \n", x, y);
    }
}


class Child0802 extends Parent0802{
    // Field
    String nickname;

    // Constructor
    Child0802(String name, int age, String nickname){
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public void work(String msg){
        System.out.println(msg);
    }

    // Method
    // public void work(int a){ // 오버로딩!! 얘는 부모클래스의 work를 오버라이딩 했다고 볼 수 없다.
    public void work(){ 
        // System.out.println(nickname + " 일하는 중..." + a);
        System.out.println(nickname + " 일하는 중...");
        System.out.println("자식 클래스의 work 메서드 호출");
    }
}