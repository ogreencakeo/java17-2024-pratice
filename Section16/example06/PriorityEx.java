package Section16.example06;

// 아무리 우선순위가 10으로 주었다 하나, 작업을 마치는 빈도가 높을 뿐이지,
// 무조건 100% 먼저 끝낸다는 보장이 없다.
// 어차피 자바는 순환할당(Round-Robin) 방식을 사용하고 있기 때문에,
// CPU 스케쥴러의 상태에 따라 달라진다.

public class PriorityEx {
    public static void main(String[] args) {

        // 메인 스레드
        Thread thread1 = Thread.currentThread();
        System.out.println(thread1.getName() + " : " + thread1.getPriority());

        for(int i=1; i<=10; i++){
            Thread thread = new CalcThread("Thread : " + i);

            // Thread 1, 2, 3, 4는 우선순위가 가장 낮다.
            // Thread 5 는 우선순위 10으로 가장 높다.
            if( i != 10){
                thread.setPriority(Thread.MIN_PRIORITY);
                // thread.setPriority(1);
            }else{
                thread.setPriority(Thread.MAX_PRIORITY);
                // thread.setPriority(10);
            }
            thread.start();
        }
    }
}
