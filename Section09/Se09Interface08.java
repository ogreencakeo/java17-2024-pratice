package Section09;

// 디폴트 메서드 (Default Method)
// 인터페이스 변화
// - 기존에 자바7까지는 인터페이스 멤버로써 추상메서드, 상수 만 가질 수 있었는데 이후 변화가 발생
// - 자바8 버전 이후에 변화가 생겨서 메서드 2개가 추가 ~> 디폴트 메서드, 정적 메서드
// - 자바9 버전 이후에 또 변화가 생겨서 ~> private 메서드

// 디폴트 메서드란?
// - 기본적으로 인터페이스는 완전하지 않은 추상 메서드를 선언해놓고 구현은 구현클래스(구현체)에 담당하도록 설계된 문법
// - 디폴트 메서드란 이 "구현"을 인터페이스내에서 직접 만드는 것
// - 즉, 메서드와 내용을 안에서 직접 구현 해버리는 것! (규칙을 깨버린 것)
// - 디폴트 메서드는 일반 메서드와 크게 다를바 없다.
// - 메서드 앞에 default 키워드만 붙여주면 되고, 물론 구현체에서 다시 재정의하여 사용하는 것도 가능

// 새롭게 만든 이유가 뭐지?
// - 기존 인터페이스에 새로운 추상 메서드를 만들어 놓으면 구현클래스는 그것을 재정의(오버라이딩) 해야 하는데,
// - 한두개라면 무리가 없을 수도 있는데 굉장히 많다면 여러 방법(근본적인 해결법이 아닌)들을 자꾸 사용해야 하기 때문에...
// - 그런데, 인터페이스에 디폴트 메서드를 추가하면 디폴트 메서드는 구현되어 있기 때문에 하위 클래스에서 구현이 필요 X
// - 결론적으로, 인터페이스에 추가된 디폴트 메서드는 하위 클래스를 변경하지 않도록 해준다.

public class Se09Interface08 {
    public static void main(String[] args) {
        // 객체 생성
        MyBank myBank = new MyBank();
        myBank.showMaxMoney();
        
        myBank.withraw(99_000);
        myBank.withraw(999_000);

        myBank.hi();
    }
}

interface MyAccount{
    int maxMoney = 100_000;
    void withraw(int money); // 출금

    default void showMaxMoney(){
        System.out.println("----------------------------");
        System.out.println("출금한도 금액은 " + maxMoney + "입니다.");
        System.out.println("----------------------------");
    }

    default void hi(){
        System.out.println("MyAccount default 메서드");
    }
}

class MyBank implements MyAccount{
    public void withraw(int x){
        if(x > maxMoney) System.out.println(">> 출금 한도를 넘었습니다.");
        else System.out.println(">> 출금완료 : " + x);
    }

    @Override
    public void hi(){
        System.out.println("MyAccount default 메서드 오버라이딩!!");
    }
}