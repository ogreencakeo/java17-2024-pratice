package section05;

public class Sec05For04 {
    public static void main(String[] args) {
        // for 반복문 + break, continue
        // - break : 이 키워드를 만나면 반복문이 중단
        // - continue : 이 키워드를 만나면 반복문이 중단되지 않고, 그 회차만 반복이 중단

        // Question. 1 ~ 20까지 for문으로 출력시 break로 10까지만 출력하시오.
        // 결과 예) 1 2 3 4 5 6 7 8 9 10
        for(int i=1; i<=20; i++){
            if(i>10){
                break;
            }
            System.out.println(i);
        }
    }
}
