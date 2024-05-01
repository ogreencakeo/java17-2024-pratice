package Section17.example01;

// DemonEx 클래스는 AutoSaveThread를 사용하여 데몬스레드를 생성하고 실행하는 예제를 제공한다.
public class DemonEx {
    public static void main(String[] args) {
        
        AutoSaveThread autoSaveThread = new AutoSaveThread();

        // daemon 설정 (필히, start() 호출 전에 설정을 해야한다.)
        autoSaveThread.setDaemon(true);

        // 데몬스레드 시작
        autoSaveThread.start();
        // autoSaveThread.setDaemon(true);

        // 메인 스레드가 5초동안 정지하면, daemon 스레드인 autoSaveThread가
        // 실행되고, 메인 스레드가 종료되면 더 이상 autoSaveThread가 실행이 
        // 안된다는 것을 알 수가 있다. (종속적 관계)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        System.out.println("메인스레드 종료됨");
    
    }
}
