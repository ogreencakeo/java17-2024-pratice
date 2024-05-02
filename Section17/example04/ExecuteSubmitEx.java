package Section17.example04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitEx {
    public static void main(String[] args) {
        // ExecutorService는 Java에서 제공하는 인터페이스로, 스레드 풀을 관리하고 작업을 제출하고 실행하는 기능을 제공합니다. 
        // ExecutorService를 사용하면 스레드 생성, 관리, 작업 스케줄링, 작업 완료 여부 확인 등을 편리하게 처리할 수 있습니다.
        // 최대 2개의 스레드를 가지는 스레드 풀 생성하기
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 20; i++) {
            // 20개의 작업 객체 만들기
            Runnable runnable = new Runnable() {
                @Override
                public void run() {

                    // ThreadPoolExecutor는 Java에서 제공하는 ExecutorService 인터페이스를 구현한 구체적인 클래스로, 
                    // 스레드 풀을 유연하게 생성하고 관리할 수 있도록 도와주는 클래스입니다.
                    // newFixedThreadPool(), newCachedThreadPool()은 내부적으로
                    // ThreadPoolExecutor로 만들어졌기 때문에 강제 타입변환이 가능하다.
                    // 현재 실행 중인 스레드 풀 객체를 ThreadPoolExecutor로 변환하여 사용
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

                    // 현재 스레드 풀에 있는 스레드 개수를 리턴해줌
                    int pollSize = threadPoolExecutor.getPoolSize();

                    // 작업 실행 스레드명을 얻기
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 수 : " + pollSize +
                            "], 작업 스레드 이름 : " + threadName);

                    // 일부러 예외 발생시키기 (execute()와 submit() 차이점을 보기 위해)
                    Integer.parseInt("삼");

                }
            };

            // 작업 큐에 runnable 객체를 넣는 행위, execute()는 작업처리 도중에
            // 예외가 발생하면, 해당 스레드를 스레드 풀에서 제거하고 새로운 스레드를 생성한다.
            // submit()은 예외가 발생하더라도,
            // 해당 스레드를 스레드 풀에서 제거하지 않고 재사용을 함을 알 수 있다.
            // 하여, submit()를 사용하는 것이 좋다.

            // executorService.execute(runnable);
            executorService.submit(runnable);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }

        }
        // 스레드 풀 종료 (단, 작업큐에 있는 모든 작업을 마무리 한 후에 종료시킨다.)
        executorService.shutdown();

    }
}

// execute() 메서드는 작업을 스레드 풀에 제출하고, 작업 처리 중 예외가 발생하면 해당 스레드를 제거하고 새로운 스레드를 생성합니다.
// submit() 메서드는 작업을 스레드 풀에 제출하고, 작업 처리 중 예외가 발생해도 해당 스레드를 재사용하여 다음 작업을 처리합니다. 
// 예외는 Future.get() 메서드를 호출할 때 처리됩니다.