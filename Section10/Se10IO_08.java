package Section10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Se10IO_08 {
    public static void main(String[] args) {
        // 자바 입출력
        // - 배열에 들어있는 회원 객체 정보를 텍스트 파일을 생성하여 출력해보시오.
        // - 회원 정보를 담는 MemberDTO 클래스는 "홍길동, 20살, hong@gmail.com" 이렇게 3개 정보를 가진다.
        // - 이를 회원정보를 텍스트 파일에 기록하시오.
        
        // MemberDTO 객체 생성
        MemberDTO members[] = new MemberDTO[5];
        members[0] = new MemberDTO("Superman", 20, "superman@gmail.com");
        members[1] = new MemberDTO("Batman", 20, "batman@gmail.com");
        members[2] = new MemberDTO("Antman", 20, "antman@gmail.com");
        members[3] = new MemberDTO("Wonderwomen", 20, "wonderwomen@gmail.com");
        members[4] = new MemberDTO("Batgirl", 20, "batgirl@gmail.com");
    
        File file = new File("Se10IO_08.txt");
        
        try {
            FileWriter fw = new FileWriter(file, true);

            // 회원 정보 출력
            for(MemberDTO m : members){
                // fw.write(m.toString());
                fw.write(m.getName() + ", " + m.getAge() + ", " + m.getEml() + "\n");
            }

            // 버퍼 정리 및 객체 스트림 종료
            fw.flush();
            fw.close();
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