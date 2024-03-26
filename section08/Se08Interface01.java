package section08;

// 인터페이스(Interface)

// 추상 클래스와 비슷한데...?
// - 추상 클래스와 비슷한게 맞음 -> 보다 더 추상화가 고도화 되어진 개념이 -> 인터페이스
// - 추상 클래스는 추상 메서드 뿐만 아니라 final 없는 멤버 변수, 생성자, 일반 메서드 등도 가질 수 있음 => 인터페이스와 차이점

// 상속하고도 비슷한데...?
// - 상속하고 비슷한게 맞음 ~> 다만, 차이를 위해서 extends 키워드 대신 다른 키워드를 사용
// - 표현도 상속했다라고 안하고, "인터페이스를 구현했다"라고 함.
// - 그래서 인터페이스를 이용하여 구현한 클래스를 "인터페이스 구현 클래스" 또는 "인터페이스 구현체"라고 표현

// 주의사항
// - 추상 클래스와 마찬가지로 인터페이스는 인스턴스(객체) 생성 할 수 X
// - 즉, 인터페이스는 자기 자신을 구현해줄 클래스를 만들어서 사용해야만 한다.
// - 상속과 구현을 함께 사용할 수 있다 ~> 즉, extends 키워드와 implements 키워드를 한꺼번에 사용 가능
// - 상속과 구현 동시 사용하는 extends 키워드 먼저 사용
//      ex) class 클래스명 extends 부모클래스명 implements 인터페이스명 { ... }

public class Se08Interface01 {
    public static void main(String[] args) {
        // 인터페이스(Interface)

        // Hi, Welcome 2개의 인터페이스를 구현한 클래스 사용 ~> 이 클래스의 객체를 생성해서 사용하겠다라는 의미
        Greeting g1 = new Greeting();
        g1.hi();
        g1.welcome("홍길동");
        g1.welcome();
    }    
}

// 인터페이스 정의 ~> 클래스 정의하듯이 ~> class 키워드 대신 interface 키워드 사용
interface Hi{
    public static final int MAX_SCORE = 100; // 상수
    public abstract void hi();      // 추상 메서드 
}

// 수식자 생략하고 한 줄로 추상 메서드 정의
interface Welcome{
    void welcome(String name);
}

// 인터페이스 구현 클래스
class Greeting implements Hi, Welcome{
    
    @Override
    public void hi(){
        System.out.println("안녕하세요~");
    }

    // 어노테이션 생략 가능
    // @Override
    public void welcome(String name){
        System.out.printf("%s 회원님 환영합니다. 최고 점수 획득은 %d점 입니다.\n", name, MAX_SCORE);
    }
    
    public void welcome(){
        System.out.printf("회원님 환영합니다. ");
    }
}