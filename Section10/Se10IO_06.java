package Section10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Se10IO_06 {
    public static void main(String[] args) throws IOException {
        // 자바 입출력
        // BufferedWriter 클래스를 이용하여 출력하기
        // BufferedWriter(new FileWriter())

        // [1] BufferedWriter 미사용
        // String filePath = "Se10IO_06.txt";
        // File file = new File(filePath);
        FileWriter fw = new FileWriter("Se10IO_06.txt");
        long start = System.currentTimeMillis();
        // 파일 쓰기 -> write() 메서드
        for(int i=0; i<100000; i++) fw.write(i + " : Hello, world\n");
        long end = System.currentTimeMillis();
        fw.flush();
        fw.close();
        System.out.println("BufferedWriter 사용 X :" + (end - start) + " ms"); // BufferedWriter 사용 X :199 ms    
        
        // [2] BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new FileWriter("Se10IO_06_2.txt"));
        start = System.currentTimeMillis();
        for(int i=0; i<100000; i++) bw.write(i + " : Hello, world\n");
        end = System.currentTimeMillis();
        bw.flush();
        bw.close();
        System.out.println("BufferedWriter 사용 O :" + (end - start) + " ms"); // BufferedWriter 사용 O :38 ms
    }
}
