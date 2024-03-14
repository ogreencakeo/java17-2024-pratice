package section05;

public class Sec05DoWhile02 {
    public static void main(String[] args) {
        // i++ vs i+=1 차이점
        int i=0;
        do{
            // System.out.println(i++); // 0 1 2 3 4 5 6 7 8 9 10
            System.out.println(i+=1); // 1 2 3 4 5 6 7 8 9 10 11
        }while(i <= 10);
    }
}
