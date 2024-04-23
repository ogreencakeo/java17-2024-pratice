package Section16.example08;

public class ToiletEx {
    public static void main(String[] args) {
        Toilet toilet = new Toilet();

        Thread thread1 = new UsingThread(toilet, "아버지");
        Thread thread2 = new UsingThread(toilet, "어머니");
        Thread thread3 = new UsingThread(toilet, "아들");
        Thread thread4 = new UsingThread(toilet, "딸");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
