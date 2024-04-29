package Section16.example11;

public class JoinEx {
    public static void main(String[] args) {
        double avg = 0.0;
        long total = 0L;

        SumThread sumThread = new SumThread();
        sumThread.start();

        // sumThread의 run()가 끝나지 않았을 때 getSum()을 호출하면 1~10000까지의 합이
        // 나오리라는 보장이 없다. 그래서 sumThread가 끝날 때까지 기다려 주는 코드가
        // 필요하다. 그게 바로 join()이다.

        try {
            // 메인스레드는 sumThread가 끝날 때까지 기다린다. (일시정지)
            sumThread.join();
        } catch (InterruptedException e) {}

        // System.out.println(sumThread.getSum());
        total = sumThread.getSum();
        avg = (double) total / 10000;

        System.out.println("1~10000까지의 합 : " + total);
        System.out.println("1~10000까지의 합의 평균 : " + avg);
    }
}
