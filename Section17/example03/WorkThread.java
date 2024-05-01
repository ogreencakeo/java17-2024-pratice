package Section17.example03;

public class WorkThread extends Thread{

    // 생성자 : 스레드 그룹과 스레드 이름을 받아서 초기화
    WorkThread(ThreadGroup threadGroup, String threadName){
        // 조상 클래스의 매개변수가 있는 생성자 호출
        // 스레드 그룹과 스레드 이름으로 스레드 초기화
        super(threadGroup, threadName); 
    }

    @Override
    public void run() {
        // 현재 실행되고 있는 스레드 그룹을 얻음
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        String str = mainGroup.getName();
        System.out.println("스레드 그룹 이름 : " + str);

        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " 인터럽트 호출됨!");
                break;
            }
        }

        System.out.println(this.getName() + " 종료됨!");
    }
}
