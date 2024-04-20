package Section15;

public class ThrowsEx {
    // JVM에게 예외를 던진다.
    public static void main(String[] args){
        // main()에서 method1() 호출하고 있으니 여기서 예외처리를 해야한다.
        try {
            method1();
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    // Throws는 메서드 선언부 끝에 작성을 하며, 호출 한 곳에서 예외를 되던지며,
    // 예외를 반드시 처리해야 한다.
    public static void method1() throws Exception{
        method2();
    }

    public static void method2() throws Exception{
        System.out.println(10/0); // 산술 예외 (실행 예외)
    }
}

// [1] main 메서드에서 method1()을 호출.
// [2] method1()은 throws Exception을 선언하여 예외를 처리하지 않고 떠넘기는 메서드임.
// 따라서 main 메서드에서는 method1() 호출 시 예외 처리를 해야 함.
// [3] method1() 내부에서는 method2()를 호출.
// [4] method2()는 throws Exception을 선언하여 예외를 처리하지 않고 떠넘기는 메서드임.
// [5] method2() 내부에서는 System.out.println(10/0);을 실행. 
// 이는 산술 연산 중에 발생하는 ArithmeticException을 유발하는 코드.
// [6] 실행 중에 예외가 발생하면 예외는 해당 메서드를 호출한 메서드로 전파.
// [7] method2()에서 발생한 ArithmeticException은 method1()으로 전파.
// [8] method1()에서는 해당 예외를 떠넘기고 있으므로, main 메서드에서 호출할 때 throws Exception으로 처리하도록 되어 있다.
// 따라서 main 메서드에서 method1() 호출 시 try-catch 구문으로 예외 처리를 시도한다.
// [9] 예외가 발생하면 catch 블록이 실행되어 "예외발생"을 출력하고 프로그램이 종료됨.

// 요약하면, main → method1() → method2() → 예외 발생 순서로 작동하며, 
// 각 메서드에서는 예외가 발생하면 예외를 떠넘기거나 처리한다. 
// 최종적으로 main 메서드에서는 try-catch로 예외를 처리하고 해당 메시지를 출력한다.






