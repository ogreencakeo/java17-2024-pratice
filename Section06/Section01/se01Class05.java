package Section06.Section01;

public class se01Class05 {
    public static void main(String[] args) {
        // Call By Value - 값에 의한 호출
        // - 자바에서 메서드에 인자(인수, 전달값)를 전달하는 방식중 하나
        // - 전달하는 인자의 타입이 기본형이면 값 자체가 그대로 복사되어서 전달되고, 참조형이면 참조 값이 전달
        // - 예) int 타입의 인수를 전달하면 해당 값이 복사되어 호출되는 메서드로 전달

        // Swap -> swap -> 100, 200

        Swap swap = new Swap();
        swap.swapTest(100, 200);
    }
}

class Swap{
    private void swap(int x, int y){
        System.out.println("SWAP - private");
        System.out.println("x + y = " + (x+y));
    }

    public void swapTest(int x, int y){
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        swap(x, y);
    }
}
