package Section11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Se11IO_03 {
    public static void main(String[] args) {
        // 파일 복사하기
        // - 프로젝트 루트 경로에 있는 sample.txt 파일을 루트내 ztemp 폴더로 복사해보시오.

        // - 어떤 클래스를 사용할까? ~> FileInputStream, FileOutputStream, File
        // - 텍스트 파일 외에도 이미지 파일도 복사가 가능할까?

        // 파일 객체 생성
        File file = new File("ztemp");
        if(!file.exists()) file.mkdir(); 

        // [참고] 폴더내 파일 리스트를 가져오고 싶다면? -> file.list() -> String[] 배열 반환
        // File file2 = new File("Section11");
        // String[] fileList = file2.list();

        // for(String f : fileList){
        //     System.out.println(f);
        // }

        // System.out.println(new File("Se11IO_03.txt").length()); // 6
        // System.out.println(new File("lorem.txt").length()); // 574
    
        // 원본 파일과 타겟 파일의 객체 생성
        File file1 = new File("lorem.txt"); // 원본파일
        File file2 = new File("C:\\Java17\\java17-2024-pratice\\Section11\\lorem_copy.txt"); // 타겟파일
    
        // 파일 복사
        try (
            FileInputStream reader = new FileInputStream(file1);
            FileOutputStream writer = new FileOutputStream(file2);
        ) {
            // [1] FileInputStream + FileOutputStream 조합 => 느리다.
            // 약 6~7초 소요 (시스템에 따라서 다를 수 있음)
            int data;
            while((data = reader.read()) != -1){
                // System.out.println(data); // 숫자
                writer.write(data);
            }
            writer.flush();
        } catch (Exception e) {
            System.out.println("File Copy Error...!");
            System.out.println(e);
        }
    }
}
