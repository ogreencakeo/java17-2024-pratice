package Section10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Se10IO_01 {
    public static void main(String[] args) throws IOException {
        // 자바 입출력
        // - 특정 디렉토리 경로에 텍스트 파일이 존재하지 않으면 생성하고 파일에 Hello, world! 글자를 써보시오.
        // - 파일 쓰기 시 알아야 할 클래스들 : File, FileWriter, Scanner
        // - 예외처리 필요 ~> throws, try ~ catch 등으로 처리 (개발톨이 자동 삽입)

        // 부연 설명 
        // - 파일 입출력은 프로그래밍 처음 공부 시 생각보다 까다롭게 느껴지고, 심지어 어렵게 느껴지는 영역 중 하나
        // - 그 이유가 뭐가 그렇게 복잡하고 뭔지 헷갈리고 도대체 왜 이렇게 복잡해?
        // - 내가 어떤 입출력 관련된 작업을 하는지 그 목적과 상황을 잘 파악하고 필요한 클래스, 메서드 사용이 뭔지 아는게 중요!

        // 파일 경로 및 이름 지정
        // 만약 경로를 구체적으로 지정하지 않고 파일명만 지정하면 해당 프로젝트 루트 폴더에 파일이 생성
        // String filepath = "test.txt";
        String filepath = "C:\\Java17\\java17-2024-pratice\\Section10\\test.txt";

        // 파일 객체 생성 ~> File
        File file = new File(filepath); // Alt + Shif + O

        // 파일이 존재하는지 유무 체크 ~> exists() 메서드 사용
        if(!file.exists()) file.createNewFile();
        
        // 파일 쓰기
        // 파일 쓰기 - 덮어쓰기, 이어 붙이기 중 옵션 설정
        // false - 이어 붙이기 안함, true - 이어 붙이기 함
        // FileWriter fw = new FileWriter(file, true);
        FileWriter fw = new FileWriter(file, false);
        fw.write("Hello, world!");
        fw.close();
    }
}
