package Section10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Se10IO_05 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 자바 입출력
        // - 문자열 배열에 들어있는 한글 내용을 텍스트 파일에 기록해보시오.
        // - 사용 클래스 : PrintWriter

        // 파일 경로 및 이름 지정
        String filePath = "Se10IO_05.txt";

        // 파일 객체 생성
        File file = new File(filePath);

        try (PrintWriter pw = new PrintWriter(file, "UTF-8")) {
            // 배열
            String animals[] = new String[]{"Dog", "Cat", "코끼리", "토끼"};
            for(String s : animals){
                pw.println(s);
            }
            pw.flush(); // 버퍼에 남아있는 모든 데이터를 출력 장치로 전송
            // pw.close(); // try에서 처리
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
