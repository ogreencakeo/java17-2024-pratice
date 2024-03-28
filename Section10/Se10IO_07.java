package Section10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Se10IO_07 {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        // 한글 깨짐 현상 다른 해결 방법
        // 이유 ~> PrintWriter 클래스 사용 시 기본 인코딩이 충돌나기 때문
        // 해결 ~> pw 객체 생성 시 명시적으로 UTF-8로 설정하여 객체 생성 (인코딩 예외처리 필요할 수 있음)

        String filePath = "Se10IO_07.txt";
        File file = new File(filePath);

        // PrintWriter 객체 생성
        // PrintWriter pw = new PrintWriter(file);

        // PrintWriter 클래스 기본 인코딩 출력
        String encoding = System.getProperty("file.encoding");
        System.out.println(encoding); // MS949 

        System.setProperty("file.encoding", "UTF-8");
        String encoding2 = System.getProperty("file.encoding");
        System.out.println(encoding2); // UTF-8

        // PrintWriter 객체 생성
        PrintWriter pw = new PrintWriter(file);

        String animals[] = new String[]{"Dog", "Cat", "코끼리", "토끼", "원숭이", "Alligator"};
        for(String s : animals) pw.println(s);
        pw.flush(); 
        pw.close(); 

        
    }
}
