package Section09;

// 인터페이스와 다형성 - 객체의 부품화
// - 인터페이스 하나의 타입으로 여러 객체를 담아서 실행 결과를 다양하게 만들어내는 기법 (문법적 장치)

// 다형성을 구현하는 방법과 장점
// - 다형성은 상속을 이용해서도 구현할 수 있지만, 인터페이스를 이용해서도 구현 가능
// - 보통 상속을 이용한 다형성보다 인터페이스를 이용한 다형성 구현을 더 많이 사용하므로 잘 연습하게 중요
// - 객체를 하나의 부품처럼 사용할 수 있으므로 필요하면 교체가 가능 (유지보수 용이성↑)
// - 인터페이스와 다형성 예제가 많이 헷갈린다면 ~> 그런 상황을 자꾸 생각하고 스스로 상황을 만들어보는 연습을 하면 된다.


public class Se09Interface05 {
    public static void main(String[] args) {
        // Aiperson 클래스를 통해서 객체 생성 ~> 처음에는 삼송 CPU탑재
        AiPerson ai1 = new AiPerson();
        System.out.println(ai1.cpu.getClass().getName()); // Section09.SamsongCpu
        ai1.start(); // 삼송 CPU가 동작합니다.

        // CPU 교체
        ai1.cpu = new ApploCpu(); // Section09.ApploCpu
        System.out.println(ai1.cpu.getClass().getName()); // 애폴 CPU가 동작합니다.
        ai1.start();
    }   
}

interface CPU{ void run(); }

class SamsongCpu implements CPU{
    @Override
    public void run(){
        System.out.println("삼송 CPU가 동작합니다.");
    }
}

class ApploCpu implements CPU{
    @Override
    public void run(){
        System.out.println("애폴 CPU가 동작합니다.");
    }
}

class AiPerson{
    CPU cpu = new SamsongCpu(); // 인터페이스 타입 // 다른 cpu로 교체할 수 있음

    public void start(){
        cpu.run(); // 삼송 CPU가 동작합니다.
    }
}