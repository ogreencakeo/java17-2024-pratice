package section08;

public class Se08Interface01 {
    public static void main(String[] args) {
        // 인터페이스(Interface)

        // Hi, Welcome 2개의 인터페이스를 구현한 클래스 사용 ~> 이 클래스의 객체를 생성해서 사용하겠다라는 의미
        Greeting g1 = new Greeting();
        g1.hi();
        g1.welcome("홍길동");
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

    @Override
    public void welcome(String name){
        System.out.printf("%s 화원남 환영합니다. 최고 점수 획득은 %d점 입니다.\n", name, MAX_SCORE);
    }
}