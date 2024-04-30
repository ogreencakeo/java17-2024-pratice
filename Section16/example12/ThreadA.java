package Section16.example12;

public class ThreadA extends Thread{
    // 공유객체 선언
    private WorkObject workObject;

    ThreadA(WorkObject workObject){
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            workObject.methodA();
        }
        System.exit(0);
    }
}
