package Section12;

public class Se12Generic09 {
    public static void main(String[] args) {
        // 제약을 걸어 제너릭 메서드 만들기
        // charAt : String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용
        int number = 300;
        // String str = String.valueOf(number);
        // System.out.println(str.charAt(0)); // 3

        // char c = str.charAt(0);
        // System.out.println(c); // 3

        // 메서드 호출
        // [1]
        // Se12Generic09.showFirstChar("USA"); // U
        // Se12Generic09.showFirstChar(12345); // error -> 컴파일 단계에서 바로 에러 발견 X

        // [2]
        Se12Generic09.showFirstChar("가나다라"); // 가
        // Se12Generic09.showFirstChar(12345); // 컴파일 단계에서 바로 에러 발견

    }

    // 제네릭 메서드 만들기 (1)
    // public static <T> void showFirstChar(T param){
    //     System.out.println(((String) param).charAt(0));
    // }
    
    // 제네릭 메서드 만들기 (2)
    // CharSequence : 인터페이스
    public static <T extends CharSequence> void showFirstChar(T param){
        System.out.println(param.charAt(0));
    }
}
