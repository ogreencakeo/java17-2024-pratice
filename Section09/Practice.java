package Section09;
public class Practice {
    public static void main(String[] args) {
        Greeting2 g = new Greeting2();
        g.hi();
        g.welcome();
        g.welcome("오오");
    }
}


interface Hi2{
    public static final int MAX_SCORE = 100;
    void hi();
}

interface Welcome2{
    void welcome();
}

class Greeting2 implements Hi2, Welcome2{
    public void hi(){System.out.println( "회원님 안녕하세요");}
    public void welcome(){System.out.println("최고 획득 점수는 " + MAX_SCORE) ;}

    public void welcome(String name){
        System.out.println(name+"회원님 안녕하세요");
    }
}