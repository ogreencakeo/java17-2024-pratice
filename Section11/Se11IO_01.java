package Section11;

import java.io.File;
import java.io.FileOutputStream;

public class Se11IO_01 {
    public static void main(String[] args) {
        // 다양한 조합으로 파일 입력/출력(읽기/쓰기) 다루기
        // - 예외처리 학습
        // - 텍스트 파일에 쓰기 후 ~> 해당 파일의 내용을 읽어들여서 콘솔에 출력하는 예제를 만들어보시오.
        // - 쓰기 ~> FileOutputStream (바이트 단위)
        // - 읽기 ~> FileInputStream (바이트 단위)

        // 파일 경로 및 이름 지정
        String filePath = "Se11IO_1.txt";
        File file = new File(filePath);

        // 파일 쓰기 객체 생성이 아닌 선언만....
        // 개선된 try catch문을 사용하면 try 블록을 벗어나는 순간 자동으로 close 호출이 되어지면서 종료
        try (FileOutputStream writer = new FileOutputStream(file)){
            // [1] 26개 알파벳 대문자 파일에 쓰기
            
            // [2] 26개 알파벳 대문자 파일로부터 읽어오기 ~> 읽어와서 콘솔에 출력
        } catch (Exception e) {
            System.out.println("File Output Error...!");
        }
    }
}
