package Section16.example02;
// java.awt.Toolkit;

// Runnable 인터페이스를 직접 구현하고 있다.
public class Beep implements Runnable{

    @Override
    public void run() {
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
    }
    
}
