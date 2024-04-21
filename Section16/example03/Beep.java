package Section16.example03;

// 상속을 받아서 스레드 클래스로 만듦.
public class Beep extends Thread{
    @Override
    public void run() {
        String message = "삐융";
        for(int i=0; i<5; i++){
            System.out.println(message);
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
