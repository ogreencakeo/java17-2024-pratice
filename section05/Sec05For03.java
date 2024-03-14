package section05;

public class Sec05For03 {
    public static void main(String[] args) {
        // for 반복문 - 생략, break 반복 탈출, 값을 증가시키는 다양한 방법
        // - 초기식; 조건식; 증감식; -> 생략 가능
        // - 위 3가지 식이 모두 없어도 for 반복문 실행하는 것이 가능함
        //      -> 단, 조건이나 증감이 없다면 무한루프에 빠지게 됨
        // [1]
        // for(; ; ){
        //     System.out.println("Hello");
        // }

        // [2]
        // 조건식 없이 무한루프에 빠져 나오려면 ~> break 사용
        // int i = 1;
        // for(; ; ){
        //     System.out.println(i++);
        //     if(i == 10) break;
        // }

        // [3]
        // 값을 증가시키는 다양한 방법
        // [3-1]
        // 0 2 4 6 8 처럼 출력하시오.
        for(int i=0; i<10; i+=2){
            System.out.println(i);
        }

        // [3-2] 
        // 1 3 5 7 9 처럼 출력하시오
        for(int i=1; i<10; i+=2){
            System.out.println(i);
        }

         // [3-3]
        int i = 1;
        System.out.println(i+=1); // 2
        System.out.println(i+=1); // 3
        System.out.println(i+=1); // 4

        int x = 100, y = 500;
        System.out.println(x); // 100
        System.out.println(x = 200); // 200
        System.out.println(y = y+1); // 501
        System.out.println(y+=1); // 201
        System.out.println(y+=100); // 701
    }
}