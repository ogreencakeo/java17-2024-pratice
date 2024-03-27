package Section10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Se10IO_04 {
    public static void main(String[] args) throws FileNotFoundException {
        // 자바 입출력
        // - 문자열 배열에 들어있는 내용을 텍스트 파일에 기록해보시오.
        // - 사용 클래스 : printWriter

        // 파일 경로 및 이름 저장
        String filePath = "sample.txt";

        // 파일 객체 생성
        File file = new File(filePath);

        // PrintWriter 객체 생성
        PrintWriter pw = new PrintWriter(file);
        
        // 문자열 배열 데이터
        String[] animals = new String[]{"Tiger", "Lion", "rabbit", "Hippo", "Alligator"};

        // 파일에 쓰기
        for(String str : animals){
            System.out.println(str);
            pw.println(str);
        }

        // 버퍼 정리 및 객체 스트림 종료
        pw.flush();
        pw.close();
    }
}
