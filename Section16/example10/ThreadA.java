package Section16.example10;

public class ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while(!stop){
            if(work){
                try {
                    Thread.sleep(50);
                } catch (Exception e) {}
                System.out.println("ThreadA의 작업내용");
            }else{
                // 무의미한 반복을 막기 위해 다른 스레드한테 양보함.
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
