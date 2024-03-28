package Section10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Se10IO_09 {
    public static void main(String[] args) {
        // 자바 입출력 : 다양한 조합 구성해보기 (중요 : ★★★★★)
        // - 이 예제 기본 틀은 앞의 8번 예제를 그대로 복사해서 가지고 옴

        // - 입출력 처음 공부하는 비기너들이 가장 어렵게 느끼는 파트가 바로 -> 클래스간 조합
        // - 이유는 너무 헷갈리고 복잡하기 때문 ~> 뭘 감싸줘야 하는지(?), 옵션이 왜 안되는지... 등
        // - 그래서 대부분의 처음 공부자들은 여기서 포기하고, 이후에 다시 공부

        // - 앞 예제에서 한글 깨지는 현상 수정 + 속도 향상(BufferedWriter) ~> 다양한 조합이 가능
        // - 이거는 해보면 생가보다 헷갈릴 수 있음

        // 여러 조합 덜 헷갈리는 방법
        // - 일단, 자주 보고.. 암기할 수 있으면 최대한 오랫동안 암기하고...
        // - 공식문서도 자주 보고.. 클래스 계층구조도 자주 보고... 본거 또 보고.. 하는 수 밖에 없음
        // - 보기만 하면 안되고 자꾸 타이핑 치고 써봐야 오래 기억

        // MemberDTO 객체 생성
        MemberDTO members[] = new MemberDTO[5];
        members[0] = new MemberDTO("Superman", 20, "superman@gmail.com");
        members[1] = new MemberDTO("Batman", 20, "batman@gmail.com");
        members[2] = new MemberDTO("Antman", 20, "antman@gmail.com");
        members[3] = new MemberDTO("Wonderwomen", 20, "wonderwomen@gmail.com");
        members[4] = new MemberDTO("Batgirl", 20, "batgirl@gmail.com");
    
        File file = new File("Se10IO_09.txt");
        
        try {
            // aA가金 <~ 이렇게 텍스트 파일에 출력(쓰기) 하시오.
            // FileOutputStram 클래스를 사용해서도 텍스트 파일에 쓰기를 할 수 있다. 단, 얘는 바이트 단위로 쓰기
            // 바이트 단위로 입력/출력이 되는 클래스 ~> 보통 클래스명이 Stream으로 끝난다.
            // 문자(char) 단위로 입력/출력이 되는 클래스 ~> 보통 클래스명이 Reader/Writer로 끝난다.
            FileOutputStream writer = new FileOutputStream(file, true);
            writer.write(97); // a 
            writer.write(65); // A 
            writer.write('b'); // b
            writer.write('B'); // B

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MemberDTO{
    // Field
    String name;
    int age;
    String eml;

    // Constructor
    MemberDTO(String name, int age, String eml){
        this.name = name;
        this.age = age;
        this.eml = eml;
    }

    // Setter Method
    @Override
    public String toString(){
        return "[ name : " + this.name + ", age : " + this.age + ", eml : " + this.eml + " ]\n";
    }


    // Getter Method
    String getName(){return this.name;}
    int getAge(){return this.age;}
    String getEml(){return this.eml;}
}
