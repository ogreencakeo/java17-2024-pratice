package Section16.example09;
// 스레드의 상태를 알아보기 위한 클래스
public class TargetThread extends Thread{
    @Override
    public void run() {
        // 실행 -> 실행대기(Runnable) -> 실행 
        for(long i=0; i<2000000000; i++){
        }
        // 일시 정지 (TIMED_ARINING)
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {}
        // 실행 -> 실행대기(Runnable) -> 실행 
        for(long i=0; i<2000000000; i++){
        }
    } // 종료 (TERMINATED)
}
