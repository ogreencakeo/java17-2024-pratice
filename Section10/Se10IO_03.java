package Section10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Se10IO_03 {
    public static void main(String[] args) throws FileNotFoundException {
        // 자바 입출력
        // - 정수형 배열에 들어있는 내용을 텍스트 파일에 기록해보시오.
        // - 알아야 할 클래스 : PrintWriter

        // 파일 경로 및 이름 지정
        String filePath = "bbb.txt";
        File file = new File(filePath);

        // PrintWriter 객체 생성
        PrintWriter pw = new PrintWriter(file);

        // 정수형 배열 데이터
        int nums[] = new int[]{1, 2, 3, 4, 5, 10, 20};

        // 파일에 쓰기
        for(int x : nums){
            // System.out.println(x); // 텍스트 파일에 출력하는게 아님
            pw.println(x);
        }

        // 객체 종료
        pw.close();
    }
}
