package Section16.example05;

public class ThreadNameEx {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 명 : " + thread.getName());

        ThreadA threadA = new ThreadA();
        threadA.start();
        System.out.println("[ ThreadeA를 생성한 스레드 이름 ] : " + thread.currentThread().getName());
        System.out.println("[ main스레드가 ThreadA의 이름을 가져온 것 ] : " + threadA.currentThread().getName());

        ThreadB threadB = new ThreadB();
        System.out.println("[ ThreadB를 생성한 스레드 이름 ] : " + thread.currentThread().getName());
        System.out.println("[ main스레드가 threadB의 이름을 가져온 것 ] : " + threadB.currentThread().getName());
        threadB.start();

        // 위의 코드들은 메인 스레드 2개의 스레드를 생성해서 start() 시켜주는 것
        // 비로소 ThreadA와 ThreadB가 독립적으로 실행이 이루어진다.
    }
}
