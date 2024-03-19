package Section06.ex02;

public class App2 {
    public static void main(String[] args) {
        String greeting = "Hi ~ ^^";
        new Start().main(greeting);
    }
}

class Start{
    public final double PI = 3.14;

    public void main(String str){
        System.out.println("===" + str + "===");

        System.out.println(PI);
    }
}
