package Section09;

// 인터페이스와 다형성 - 객체의 부품화
// - 앞에서 했던 예제를 인터페이스 타입의 배열을 만들어 구현 객체를 담아 반복문으로 출력해보시오.
// - 상황 : CPU를 4개 탑재한 AI 로봇 객체를 만든다면?

public class Se09Interface05_2 {
    public static void main(String[] args) {

        // 객체 생성 -> 처음에는 삼송 GPU 4개 -> 2개로 교체
        AiRobot robot1 = new AiRobot();
        robot1.start();
        System.out.println();

        // GPU 교체 -> 4개중에 2개만 애폴 GPU로 교체
        robot1.gpus[0] = new ApploGpu();
        robot1.gpus[2] = new ApploGpu();
        robot1.start();
    }
}

interface Gpu{ void run(); }

class SamsongGpu implements Gpu { 
    @Override
    public void run(){
        System.out.println("삼송 GPU가 동작합니다.");
    } 
}

class ApploGpu implements Gpu { 
    @Override
    public void run(){
        System.out.println("애폴 GPU가 동작합니다.");
    } 
}

class AiRobot{
    Gpu gpus[] = {
        new SamsongGpu(),
        new SamsongGpu(),
        new SamsongGpu(),
        new SamsongGpu(),
    };

    public void start(){
        for(Gpu g : gpus) g.run();
    }
}