package Section05;

public class Sec05For06 {
    public static void main(String[] args) {
        // 반복문 연습문제 - 별 찍기 예제
        // *
        // **
        // ***
        // ****
        // *****
        // 이중(중첩) 반목문을 사용하겠구나 라고 생각! - for문 사용
        for(int i=1; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();

        // 역삼각형 모양으로 찍기
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
