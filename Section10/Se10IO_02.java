package Section10;

import java.io.File;

public class Se10IO_02 {
    public static void main(String[] args) {
        // 자바 입출력
        // - 파일 용량 체크하기 ~> File 클래스, file.length() 메서드 사용
        // - file.exists() 파일 존재 여부 체크 => 파일이 존재하지 않으면 반환 값은 => 0

        // 파일 경로 및 이름 지정
        String filePath = "C:\\Java17\\java17-2024-pratice\\Section10\\test2.txt";

        // 파일 객체 생성 => File 클래스
        File file = new File(filePath);

        // 파일 존재하는지 유무 체크하여 파일 용량 체크
        if(file.exists()){
            long fileSize = file.length(); // 바이트 단위
            System.out.println(fileSize); // 898
        }else{
            System.out.println("file does not exist");
            long fileSize = file.length();
            System.out.println(fileSize); // 파일이 존재하지 않으므로 반환값 : 0
        }
    }
}
