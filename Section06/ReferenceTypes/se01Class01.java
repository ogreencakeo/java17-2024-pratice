package Section06.ReferenceTypes;

public class se01Class01 {
    public static void main(String[] args) {
        
        Swap swap = new Swap();

        Mynum m1 = new Mynum(100);
        Mynum m2 = new Mynum(200);
        System.out.println(m1.value + ", " + m2.value); // 100, 200

        // swap.swapTest(m1.value, m2.value); // int 타입의 기본형으로 전달
        swap.swapTest(m1, m2); // 참조형 타입
        
    }
}

class Mynum{
    int value;
    
    Mynum(int a){ this.value = a; }
}

class Swap{
    private void swap(int x, int y){
        // 전달되는 값이 기본형인 경우 -> 값 자체가 복사되어 전달
        // 전달되는 값이 참조형인 경우 -> 참조하는 값(주소, 번지)이 복사되어 전달
        // 메서드 입장에서 본다면
        //      1. 메서드의 매개변수가 기본형으로 받는 경우에는 인자로 전달되는 값(원시값)이 그대로 매개변수에 복사되어 전달
        //      2. 메서드의 매개변수가 참조형으로 받는 경우에는 인자로 전달되는 값(주소값)이 그대로 매개변수에 복사되어 전달
        // 기본형은 가볍다, 참조형은 무겁다

        int temp = x;
        x = y;
        y = temp;
        System.out.println("SWAP - private");
        System.out.println("바꾸기 완료후 x = " + x);
        System.out.println("바꾸기 완료후 y = " + y);
    }

    public void swapTest(Mynum x, Mynum y){

        swap(x, y); 
    }
    
}