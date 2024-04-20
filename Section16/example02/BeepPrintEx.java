package Section16.example02;

// java.awt.Toolkit;

// 스레드는 한번 start()를 다 실행하고 나면, 재실행이 안된다.
// 재실행을 하고자 한다면, 인스턴스를 한 개 더 만들어야 한다. (중요)

public class BeepPrintEx {
    private static final String Toolkit = null;

    // main() 은 JVM이 실행한다.
    public static void main(String[] args) {

        // 직접 생성하는 멀티 스레드 방법 3가지
        // 방법 1 : 구현 객체 대입
        // Runnable runnable = new Beep(); // 구현 객체 대입
        // Thread thread = new Thread(runnable);
        // thread.start();

        // 방법 2 : 익명구현 객체
        // Thread thread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         Toolkit toolkit = Toolkit.getDefaultToolkit();
        //         for(int i=0; i<5; i++){
        //             // toolkit.beep();
        //             try {
        //                 System.out.println("비프음 실행하는 스레드 명 : " + Thread.currentThread().getName());
        //                 Thread.sleep(500);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // });
        // thread.start();

        // 방법 3 -> 람다식 (함수적 인터페이스) JDK1.8 코드 절약, 가독성
        Thread thread = new Thread(() -> {
            // Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5; i++){
                // toolkit.beep();
                try {
                    System.out.println("비프음 실행하는 스레드 명 : " + Thread.currentThread().getName());
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("삐융");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        
        // 싱글 스레드를 멀티 스레드로 바꿔서 프로그램을 만들어야 한다.
    } 
}
