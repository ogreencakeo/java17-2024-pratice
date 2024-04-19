package Section15;

public class NullPointerEx {
    public static void main(String[] args) {
        
        String str = null;
        // 이 예외는 객체(인스턴스)가 없는데 어떻게 인스턴스에 있는 toString() 호출하니?
        System.out.println(str.toString());

    }
}
