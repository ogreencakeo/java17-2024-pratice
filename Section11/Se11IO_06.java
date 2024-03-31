package Section11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Se11IO_06 {
    public static void main(String[] args) {
         // 파일 객체 생성
        File file = new File("ztemp");
        if(!file.exists()) file.mkdir(); 

        File file1 = new File("java.png"); // 원본파일
        File file2 = new File("se11I0_06_java_copy.png"); // 타겟파일
    
        // 파일 복사
        try (
            FileInputStream reader = new FileInputStream(file1);
            FileOutputStream writer = new FileOutputStream(file2);
        ) {

            // [1] FileInputStream + FileOutputStream 조합 => 느리다.
        
            // [2] FIS + FOS + BufferedInputStream + BufferedOuptputStream 조합
            // Buffered~로 감싸준 다음에 1번 코드의 주석을 풀고 그대로 사용하면 끝

            // [3] FileInputStream + FileOutputStream + byte[] 조합 : 내가 정한 사이즈 단위로 읽기, 쓰기 가능
            byte buff[] = new byte[1024];
            int data;

            long start = System.currentTimeMillis();
            while((data = reader.read(buff)) > 0){
                writer.write(buff, 0, data); 
            }

            writer.flush();
            long end = System.currentTimeMillis();
            System.out.println("파일 복사에 걸린 시간 : " + (end - start)); // 0

        } catch (Exception e) {
            System.out.println("File Copy Error...!");
            System.out.println(e);
        }
    }
}
