package Section16.example01;

// java.awt.Toolkit;

public class BeepPrintEx {
    // main() 은 JVM이 실행한다.
    public static void main(String[] args) {
        // 현재 실행 중인 스레드명을 출력함.
        // System.out.println(Thread.currentThread().getName());

        // Toolkit은 추상클래스인데, 그중에 GUI 관련된 메서드들로 구성되어진 인스턴스를
        // getDefaultToolkit()를 통해서 Toolkit클래스의 참조를 얻어낸다. 

        // Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            // System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
            
            // toolkit.beep();  // 비프음 출력
            
            // 스레드가 너무 빨리 실행하니까 0.5초동안 멈춘다.
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        for(int i=0; i<5; i++){
            System.out.println("삐융");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        
        // 싱글 스레드를 멀티 스레드로 바꿔서 프로그램을 만들어야 한다.
    }    
}
