package Section10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Se10IO_10 {
    public static void main(String[] args) {
        // 다양항 조합으로 파일 입력/출력(읽기/쓰기) 다루기
        // - 예외처리 학습
        // - 텍스트 파일에 쓰기 후 ~> 해당 파일의 내용을 읽어들여서 콘솔에 출력하는 예제를 만들어보시오.
        // - 쓰기 ~> FileOutPutStream (바이트 단위)
        // - 읽기 ~> FileInputStram(바이트 단위)

        String filePath = "Se10IO_10.txt";
        File file = new File(filePath);

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 파일 쓰기 객체를 생성이 아닌 선언만..
        // 기존의 try catch문
        // FileOutputStream writer = null;
        // try {
        //     writer = new FileOutputStream(file);
        //     writer.write(65); // A
        //     writer.flush();
        //     // writer.close();
        // } catch (Exception e) {
        //     System.out.println("File Output Error...!");
        // }finally{
        //     try {
        //         writer.close();
        //     } catch (IOException e) {;}
        // }

        // 개선된 try catch문
        try (FileOutputStream writer = new FileOutputStream(file)){
            writer.write(65); // A
            writer.flush();
            // writer.close();
        } catch (Exception e) {
            System.out.println("File Output Error...!");
        }
    }
}
