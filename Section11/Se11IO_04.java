package Section11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Se11IO_04 {
    public static void main(String[] args) {
        // 파일 객체 생성
        File file = new File("ztemp");
        if(!file.exists()) file.mkdir(); 

        // File file1 = new File("java.png"); // 원본파일
        File file1 = new File("sample.txt"); // 원본파일
        // File file2 = new File("C:\\Java17\\java17-2024-pratice\\ztemp\\java_copy.png"); // 타겟파일
        File file2 = new File("C:\\Java17\\java17-2024-pratice\\Section11\\sample_copy.txt"); // 타겟파일
    
        // 파일 복사
        try (
            FileInputStream reader = new FileInputStream(file1);
            FileOutputStream writer = new FileOutputStream(file2);
            // BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file1));
            // BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file2));
        ) {

            // [1] FileInputStream + FileOutputStream 조합 => 느리다.
            // System.out.println("이미지 복사에 걸린 시간 => " + (end - start)); // 822


            // [2] FIS + FOS + BufferedInputStream + BufferedOuptputStream 조합
            // Buffered~로 감싸준 다음에 1번 코드의 주석을 풀고 그대로 사용하면 끝
            // long start = System.currentTimeMillis();
            // System.out.println(new File("java.png").length()); // 100065
            // int data;
            // while((data = reader.read()) != -1){
            //     // System.out.println(data); // 숫자
            //     writer.write(data);
            // }
            // long end = System.currentTimeMillis();
            // System.out.println("이미지 복사에 걸린 시간 => " + (end - start)); // 12

            // [3] FileInputStream + FileOutputStream + byte[] 조합 : 내가 정한 사이즈 단위로 읽기, 쓰기 가능
            // System.out.println(reader.read()); // 97
            // System.out.println(reader.read()); // 98
            byte[] buff = new byte[1024]; // buff 사이즈 단위로 읽기, 쓰기
            int data1, data2;
            data1 = reader.read(); 
            data2 = reader.read(buff);
            System.out.println(data1); // 콘솔 (97)
            System.out.println(data2); // 콘솔 (5)
            // writer.write(data); // 텍스트 ()

            writer.flush();
        } catch (Exception e) {
            System.out.println("File Copy Error...!");
            System.out.println(e);
        }
    }
}
