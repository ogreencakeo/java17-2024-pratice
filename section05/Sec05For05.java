package section05;

public class Sec05For05 {
    public static void main(String[] args) {
        // 이중 반복문
        // - 중첩하여 반복문을 쓴다해서 중첩 반복문이라고도 함
        // - 여기서 이중 반복문 사용을 잘 해놔야만, 2차원 배열에 잘 이해할 수 있음
        // - 대표적인 이중 반복문 예제 : 구구단 출력, 별표 찍기 등
        // - 구구단을 이중 반복문 사용해서 기초, 세로 출력을 할 수 있다는 것은 결코 쉬운 일은 아니다.

        // [1] 특정 원하는 단만 출력하기 ~> 이중 반복문 필요 X
        int dan = 5;
        // 5 x 1 = 5
        // 5 x 2 = 10
        // ....
        // 5 x 9 = 45

        for(int i=1; i<10; i++){
            System.out.printf("%d x %d = %d \n", dan, i, 5*i );
        }

        // [2] 한개 단 출력이 아닌 여러 단 출력 ~> 즉, 확장이 필요해지면 이중 반복문 고려
        // "확장" ~> 매우 중요한 키워드 ~> 배열 파트를 공부할 때도 이 확장이 필요할 때 2차원 배열 쓰는 것을 고려
        // 2 x 1 = 2
        // ....
        // 2 x 9 = 18
        // ..
        // 5 x 1 = 5
        // ...
        // 5 x 9 = 45

        for(int i=2; i<=5; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%d x %d = %d \n", i, j, i*j);
            }
        }

        System.out.println();

        // [3] 구구단 가로 출력
        // 이런거 할 때는 그려놓고 생각해보자 (안그리고 할 때 보다 머릿속에 정리가 되는 편)
        // 2x1=2  3x1=3  4x1=4 ....... 9x1=9
        // 2x2=4  3x2=6  4x2=8 ....... 9x2=18
        /// ...
        for(int i=1; i<=9; i++){
            for(int j=2; j<=9; j++){
                System.out.printf("%d x %d = %2d\t", j, i, i*j);
            }
            System.out.println();
        }

        System.out.println();

        // [4] 보충강좌
        // - 상단에 한 줄이 추가 => 바깥쪽 for문 => 10번 반복
        // - 자릿수 정렬
        // 2단           3단 
        // 2 x 1 = 2     3 x 1 = 3
        // 2 x 2 = 4     3 x 2 = 6
        // 2 x 3 = 6     3 x 3 = 9
        // 2 x 4 = 8     3 x 4 = 12
        // 2 x 5 = 10   .......
        // 2 x 6 = 12
        // 2 x 7 = 14
        // 2 x 8 = 16
        // 2 x 9 = 18

        for(int i=0; i<=9; i++){
            for(int j=2; j<=9; j++){
                if(i==0) System.out.printf("%d단 \t", j);
                else System.out.printf("%dx%d=%d \t", j, i, j*i);
            }
            System.out.println();
        }
    }
}
