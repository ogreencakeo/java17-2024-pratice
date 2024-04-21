package Section16.example03;

public class BeepEx {
    public static void main(String[] args) {
        // 필드의 다형성
        Thread thread = new Beep();
        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("*************");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
