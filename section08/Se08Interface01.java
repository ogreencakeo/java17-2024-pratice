package section08;

public class Se08Interface01 {
    
}

// 인터페이스 정의
// 클래스 정의하듯이 하면 됨 -> 그저 class 대신 interface 써주면 되는구나 생각하면 쉬움
interface Hi{
    public static final int MAX_SCORE = 100; // 성수
    public abstract void hi(); // 추상 메서드
    // 이 둘만 멤버가 될 수 있음
    // public static final, public abstract 수식자들은 생략 가능
}