package section05;

public class Sec05For03 {
    public static void main(String[] args) {
        // for 반복문 - 생략과 값을 증가시키는 다양한 방법
        // - 초기식; 조건식; 증감식; -> 생략 가능
        // - 위 3가지 식이 모두 없어도 for 반복문 실행하는 것이 가능함
        //      -> 단, 조건이나 증감이 없다면 무한루프에 빠지게 됨
        // [1]
        // for(; ; ){
        //     System.out.println("Hello");
        // }

        // [2]
        // 조건식 없이 무한루프에 빠져 나오려면 ~> break 사용
        int i = 1;
        for(; ; ){
            System.out.println(i++);
            if(i == 10) break;
        }

    }
}
