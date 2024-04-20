package Section15;

public class ThrowEx {
    public static void main(String[] args) {
        try {
            // 강제로 예외를 발생시키는 키워드가 throw이다.
            throw new Exception("고의로 예외 발생 시킴");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("정상 종료");
    }

}
