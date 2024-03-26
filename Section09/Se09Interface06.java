package Section09;

// 매개변수의 다형성
// - 매개변수로 인터페이스 타입의 구현 객체를 전달 받는 것
// - 메서드의 매개변수로 구현 객체가 전달되었을 때 다형성에 의해 결과가 다양하게 출력되는 기능
//  1. Complexer(복합기) 인터페이스
//  2. Scanner 클래스
//  3. Printer 클래스
//  4. User 클래스

public class Se09Interface06 {
    public static void main(String[] args) {
        // 객체 생성 
        User user = new User();
        System.out.println(user.name); // 홍길동

        // 인터페이스 구현객체 생성 -> 이때, 구현클래스 타입 그대로 받아서 생성
        Scanner scanner = new Scanner();
        Printer printer = new Printer();

        user.start(scanner); // 스캐너가 동작합니다. 스윽스윽~
        user.start(printer); // 프린터가 동작합니다. 드륵드륵~
    }
}

interface Complexer{ void run(); }

class Scanner implements Complexer{
    @Override
    public void run(){ System.out.println("스캐너가 동작합니다. 스윽스윽~"); }
}

class Printer implements Complexer{
    @Override
    public void run(){ System.out.println("프린터가 동작합니다. 드륵드륵~"); }
}

class User{
    String name = "홍길동";

    public void start(Complexer c ){
        c.run();
    }
}

