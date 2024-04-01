package Section11;

import java.nio.charset.StandardCharsets;

// String 클래스 자주 사용하는 메서드
        // - length()           int         글자 수 반환
        // - getBytes()         byte[]      바이트 배열로 반환
        // - equals()           boolean
        // - charAt()           char        charAt(int index) 특정 인덱스의 문자를 반환
        // - indexOf()          int         문자열의 위치 (인덱스)를 반환
        // - valueOf()          String      기본형 타입의 값을 문자열로 변환 ~> valueOf(true) // "true"
        // - trim()                         공백 제거
        // - toUpperCase()                  대문자 ~> 새 문자열을 리턴
        // - toLowerCase()                  소문자
        // - replace()
        // - substring()
        // - concat()
        // - join()
        // - split()

public class Se11String_01 {
    public static void main(String[] args) {
        // [1] getBytes()
        // 문자열을 바이트 배열로 반환
        // 문자열을 바이트 배열로 만들어서 사용하는 경우에 사용 ~> 네트워크를 통해서 문자열 전송, 문자열 암호화 ....
        // 시스템의 기본 문자셋으로 인코딩된 바이트 배열로 반환
        System.out.println("------------------------ getBytes()");
        byte[] bar = "ABCDE".getBytes();
        for(byte b : bar){
            System.out.print(b + ", "); // 65 66 67 68 69
            System.out.println((char)b); // A B C D E
        }

        // [2] getBytes(Charset charset)
        // 특정 문자셋으로 인코딩된 바이트 배열을 반환하고자 할 때 사용 ~> getBytes("UTF-8") or ~~("EUC-KR")
        // 잘 알고 있어야 하는 이유? ~> 어떤걸로 인코딩 하느냐에 따라 배열의 크기가 달라지기 때문에...
        // EUC-KR       알파벳 1바이트, 한글 2바이트로 변환
        // UTF-8        알파벳 1바이트, 한글 3바이트로 변환
        // 문자셋 저장할 때 잘못된 값을 줄 경우 java.io.UnsupportedEncodingException이 발생 ~> 예외 처리가 필요
        // 디코딩은 ? ~> String 클래스 사용
        System.out.println("------------------------ getBytes(Charset charset)");
        String str = new String(bar, StandardCharsets.UTF_8);
        System.out.println(str); // ABCDE

        // [3] replace()
        // 문자열을 다른 값으로 바꿀 때 사용
        // String 타입은 불변성 ... 즉, 변경이 불가능한 상태를 갖기 때문에 replace() 메서드를 사용하면 새로운 문자열을 반환
        // 옵션 : replace(target, replacement)
        System.out.println("------------------------ replace()");
        String str1 = "아름다운 제주도 바다";
        System.out.println(str1); // 아름다운 제주도 바다
        String str2 = str1.replace("제주도", "울릉도");
        System.out.println(str2); // 아름다운 울릉도 바다

        // [4] substring()
        // 문자열을 잘라내고자 할 때 사용 ~> 주어진 인덱스에서 문자열을 추출한다 생각
        // 메서드 매갯값을 어떻게 주느냐에 따라서 사용법이 조금 다름
        // 주의사항 : endIdx 지정시 해당 인덱스는 제외되고 그 전까지만 잘라내기 하는 것이므로 주의!
        System.out.println("------------------------ substring()");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.length()); // 26

        // String sub1 = alphabet.substring(0, 5);
        // System.out.println(sub1); // ABCDE

        // ABCDEFGH
        // IJKLMNOPQRSTUVWXYZ
        String sub1 = alphabet.substring(0, 8);
        String sub2 = alphabet.substring(8);

        System.out.println(sub1);
        System.out.println(sub2);
    }
}
