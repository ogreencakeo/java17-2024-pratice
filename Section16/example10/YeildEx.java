package Section16.example10;

public class YeildEx {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start(); 
        threadB.start(); 

        // 3초동안은 번갈아 실행하다가 이후, ThreadA를 yeild() 호출함으로써,
        // ThreadB만 실행하게 된다.
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        threadA.work = false;

        // 다시 3초후, ThreadB가 yeild() 호출함으로써 ThreadA만 실행된다.
        try {
            Thread.sleep(3000);
        }catch(Exception e){}

        threadA.work = true;
        threadB.work = false;

        try {
            Thread.sleep(3000);
        }catch(Exception e){}

        threadA.stop = true;
        threadB.stop = true;
    }
}
