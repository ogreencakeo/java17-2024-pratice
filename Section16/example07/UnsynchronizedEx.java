package Section16.example07;

public class UnsynchronizedEx {
    public static void main(String[] args) {
        // 공유객체 생성
        Calculator calculator = new Calculator();
        
        // 문제가 무엇입니까?
        // 출력 결과를 보면, User-2 스레드가 설정한 값으로
        // User-1 스레드도 출력한다. (데이터 신뢰성 붕괴)
        // 동기화 처리를 함으로써 객체의 잠금이 일어나면서 데이터의 
        // 신뢰성을 확보해준다.
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();

        // System.out.println(calculator.getMemory());
        // System.out.println(calculator.getMemory());
        // System.out.println(calculator.getMemory());
        // System.out.println(calculator.getMemory());

    }
}
