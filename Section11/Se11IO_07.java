package Section11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Se11IO_07 {
    public static void main(String[] args) {
        // 한 라인씩 가져오는 readLine 메서드 사용하여 텍스트 파일 읽어오기
        // - 이 메서드를 사용하면 파일로부터 한 줄씩 읽어올 수 있다.
        // - readLine() 메서드를 사용하기 위해서 BufferedReader 클래스로 감싸준다.
        
        // 파일 객체 생성
        File file = new File("lorem.txt");
        System.setProperty("file.encoding", "UTF-8");

        // 파일 읽기
        try(BufferedReader reader = new BufferedReader(new FileReader(file)) ) {
            // 한 줄씩 출력되는지 테스트
            // System.out.println(reader.readLine()); // 첫번째 줄
            // System.out.println(reader.readLine()); // 두번째 줄

            // 반복문 사용해서 전부 읽어와서 콘솔에 출력하기
            long start = System.currentTimeMillis();
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            long end = System.currentTimeMillis();
            System.out.println("읽어온 시간 => " + (end-start)); // 15
            
        } catch (Exception e) {
            System.out.println("File Copy Error");
            System.out.println(e);
        }
    }
}
