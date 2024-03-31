package Section11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Se11IO_05 {
    public static void main(String[] args) {
        // 파일 객체 생성
        File file = new File("ztemp");
        if(!file.exists()) file.mkdir(); 

        File file1 = new File("sample.txt"); // 원본파일
        File file2 = new File("C:\\Java17\\java17-2024-pratice\\Section11\\sample_copy.txt"); // 타겟파일
    
        // 파일 복사
        try (
            FileInputStream reader = new FileInputStream(file1);
            FileOutputStream writer = new FileOutputStream(file2);
        ) {

            // [1] FileInputStream + FileOutputStream 조합 => 느리다.
        
            // [2] FIS + FOS + BufferedInputStream + BufferedOuptputStream 조합
            // Buffered~로 감싸준 다음에 1번 코드의 주석을 풀고 그대로 사용하면 끝

            // [3] FileInputStream + FileOutputStream + byte[] 조합 : 내가 정한 사이즈 단위로 읽기, 쓰기 가능
            // byte[] buff = new byte[1024]; // buff 사이즈 단위로 읽기, 쓰기
            // int data1, data2;
            // data1 = reader.read(); 
            // data2 = reader.read(buff);
            // System.out.println(data1); // 콘솔 (97) 유니코드
            // System.out.println(data2); // 콘솔 (5) 바이트 // bcABC 
            // writer.write(data2); // 텍스트 ()

            byte buff[] = new byte[3];
            int data;
            // data = reader.read(buff);
            // System.out.println(data); // 3이 출력 : 3바이트 읽기 -> write(배열명:buff, 0, 길이 : 3 : data)
            // writer.write(buff, 0, data); // abc 3바이트만 파일에 출력 (쓰기)

            while((data = reader.read(buff)) > 0){
                writer.write(buff, 0, data);
            }

            writer.flush();

        } catch (Exception e) {
            System.out.println("File Copy Error...!");
            System.out.println(e);
        }
    }
}
