package section08;

public class Sec08AbstractClass05 extends Sum{
    public static void main(String[] args) {
        // 추상 클래스 연습 문제
        // - 2개의 인자를 전달 받아서 총합을 int 타입으로 반환하는 추상 메서드 만들기
        // - 단, 이번에는 프로그램의 시작점인 main 메서드가 있는 클래스에서 상속을 받아 구현한다.

        // 객체 생성
        
        Sec08AbstractClass05 s1 = new Sec08AbstractClass05();
        System.out.println(s1.sumOfArgs(1, 2)); // 3
        System.out.println(s1.sumOfArgs(1, 2, 4)); // -1
    }

    @Override
    public int sumOfArgs(int x, int y){
        return x+y;
    }
    public int sumOfArgs(int x, int y, int c){
        return x+y-c;
    }

}


abstract class Sum{
    // Abstract Method
    abstract public int sumOfArgs(int a, int b);
    abstract public int sumOfArgs(int a, int b, int c);

    // Regular Method
    public void printInfo(){
        System.out.println("총합 구하기 완료");
    }
}