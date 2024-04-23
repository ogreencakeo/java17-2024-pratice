package Section16.example09;

public class ThreadStateEx {
    public static void main(String[] args) {
        // 스레드의 라이프사이클을 알아보는 내용
        Thread thread = new StatePrintThread(new TargetThread());
        thread.start();
    }
}
