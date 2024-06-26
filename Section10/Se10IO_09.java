package Section10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Se10IO_09 {
    public static void main(String[] args) {
        // 자바 입출력 : 다양한 조합 구성해보기 (중요 : ★★★★★)
        // - 이 예제 기본 틀은 앞의 8번 예제를 그대로 복사해서 가지고 옴

        // - 입출력 처음 공부하는 비기너들이 가장 어렵게 느끼는 파트가 바로 -> 클래스간 조합
        // - 이유는 너무 헷갈리고 복잡하기 때문 ~> 뭘 감싸줘야 하는지(?), 옵션이 왜 안되는지... 등
        // - 그래서 대부분의 처음 공부자들은 여기서 포기하고, 이후에 다시 공부

        // - 앞 예제에서 한글 깨지는 현상 수정 + 속도 향상(BufferedWriter) ~> 다양한 조합이 가능
        // - 이거는 해보면 생가보다 헷갈릴 수 있음

        // 여러 조합 덜 헷갈리는 방법
        // - 일단, 자주 보고.. 암기할 수 있으면 최대한 오랫동안 암기하고...
        // - 공식문서도 자주 보고.. 클래스 계층구조도 자주 보고... 본거 또 보고.. 하는 수 밖에 없음
        // - 보기만 하면 안되고 자꾸 타이핑 치고 써봐야 오래 기억

        File file = new File("Se10IO_09.txt");
        
        try {
            // aA가金 <~ 이렇게 텍스트 파일에 출력(쓰기) 하시오.
            // FileOutputStram 클래스를 사용해서도 텍스트 파일에 쓰기를 할 수 있다. 단, 얘는 바이트 단위로 쓰기
            // 바이트 단위로 입력/출력이 되는 클래스 ~> 보통 클래스명이 Stream으로 끝난다.
            // 문자(char) 단위로 입력/출력이 되는 클래스 ~> 보통 클래스명이 Reader/Writer로 끝난다.
            
            FileOutputStream writer = new FileOutputStream(file, false);
            writer.write(97);               // a 
            writer.write(65);               // A 
            writer.write('b');              // b
            writer.write('B');              // B
            writer.write('A' + 32);           // 65 + 32 = 97 ~> a
            writer.write('A' + 32 + 25);      // 122 ~> z
            writer.write(122);              // z
            // writer.write('가');    // 한글은 2바이트로 표현되는데, 이를 1바이트로 출력하기 때문
            // writer.write("가".getBytes());

            writer.write("안녕하세요\n".getBytes(StandardCharsets.UTF_8)); // 안녕하세요
            // 바이트배열로 변환 한 후 한글은 3byte => 3 * 5 = 15 // 15 + 3 = 18
            System.out.println("안녕하세요abc".getBytes(StandardCharsets.UTF_8).length); 
            System.out.println("안녕하세요".length()); // 문자열의 길이 => 5
            writer.write("안녕하세요 홍길동입니다.\n".getBytes(StandardCharsets.UTF_8), 0, 6); // 안녕
            writer.write("안녕하세요홍길동입니다.\n".getBytes(StandardCharsets.UTF_8), 15, 9); // 홍길동
            writer.write("안녕하세요 홍길동입니다.\n".getBytes(StandardCharsets.UTF_8), 16, 9); // 홍길동

            // 한글 또는 문자열은 어떻게 파일에 쓰지?
            // 해결 방법
            //      1. 문자 기반 스트림 클래스 사용 ~> FileWriter
            //      2. getBytes() 메서드 사용 ~> "안녕하세요".getBytes()

            // getBytes() 메서드
            //      - 문자열을 바이트 배열로 변환 메서드
            //      - byte[] bytes = str.getBytes(); ~> 일반적인 형태
            //      - byte[] bytes = str.getBytes( StandardCharsets.UTF_8 ); ~> 한글이 깨진다면 이렇게 해주면 보통 다 됨
            
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
