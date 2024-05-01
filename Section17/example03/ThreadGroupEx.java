package Section17.example03;

public class ThreadGroupEx {
    public static void main(String[] args) {
        // 현재 실행되고 있는 스레드 그룹을 얻어봄
        ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
        String threadGroup1 = mainGroup1.getName();

        // String str = Thread.currentThread().getThreadGroup().getName();
        System.out.println(threadGroup1); // main 스레드 그룹 이름 출력

        // myGroup은 main 그룹의 하위 그룹으로 만들어진다.
        // 새로운 스레드 그룹 myGroup을 생성합니다.
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        // WorkThread 인스턴스를 생성할 때 해당 스레드 그룹(myGroup)을 지정하여 
        // workThreadA와 workThreadB를 생성합니다.
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
        
        // 스레드들을 시작하여 스레드 그룹에 속하도록 함
        // workThreadA와 workThreadB를 시작하여
        // 각각의 스레드가 myGroup 스레드 그룹에 속하도록 합니다.
        workThreadA.start();
        workThreadB.start();

        System.out.println("[메인 스레드 그룹의 list() 메서드 호출 후 출력 내용] :");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        // 메인그룹 포함 하위그룹까지 모든 정보가 출력됨.
        mainGroup.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        // myGroup에 포함된 workThreadA, workThreadB 스레드에 인터럽트 요청함
        // 스레드 그룹을 쓰는 궁극적 이유다.
        myGroup.interrupt();
    }
}
