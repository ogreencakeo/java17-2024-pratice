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
        // createNewFile() 없어도 새로운 파일을 생성해줌.
        // FileWriter() 때문...
        // ★ 잠깐 생각해보자
        //      1. exists 메서드를 사용하지 않아도 자동으로 해당 파일명으로 파일이 생성
        //      2. 아니? 자동으로 생성해주면 뭐하러 이 메서드를 쓰지? 굳이 안써도 되는거 아니야?
        //      3. 그러나, 코드의 목적과 상황에 따라서 코드 가독성이나 없을 때의 예외처리 등을 위해서 사용하면 유용 
        //      4. 즉, 파일 존재 유무를 체크하지 않으면 무조건 파일을 생성하지만, 
        //      5. 유무를 체크하면 파일이 없을 때 다른 코드 작성도 가능 (권한 문제로 파일 생성이 안될 수도 있고...)
        //      6. 파일 용량을 체크할 때 ~> 파일이 존재하지 않으면 0을 반환하므로, 확인 전 파일 유무를 체크하는 것이 필요!
        if(!file.exists()) {
            System.out.println("파일이 존재하지 않습니다. 파일을 자동으로 생성하겠습니다.");
            file.createNewFile();
        }
        
        // 파일 쓰기 - 덮어쓰기, 이어 붙이기 중 옵션 설정
        // false - 이어 붙이기 안함, true - 이어 붙이기 함
        //  FileWriter fw = new FileWriter(file, true); // 기본값 false
        FileWriter fw = new FileWriter(file, true);
        // FileWriter fw = new FileWriter(file, false);
        fw.write("\nHello, world!\n");
        fw.write("a\n");
        fw.write("b\n");
        fw.write("c\n");
        fw.close();
    }
}
