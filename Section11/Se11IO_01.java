package Section11;

import java.io.File;
import java.io.FileInputStream;

public class Se11IO_01 {
    public static void main(String[] args) {
        // 다양한 조합으로 파일 입력/출력(읽기/쓰기) 다루기
        // - 예외처리 학습
        // - 텍스트 파일에 쓰기 후 ~> 해당 파일의 내용을 읽어들여서 콘솔에 출력하는 예제를 만들어보시오.
        // - 쓰기 ~> FileOutputStream (바이트 단위)
        // - 읽기 ~> FileInputStream (바이트 단위)

        // 파일 경로 및 이름 지정
        String filePath = "Se11IO_1.txt";
        File file = new File(filePath);

        // 파일 쓰기 객체 생성이 아닌 선언만....
        // 개선된 try catch문을 사용하면 try 블록을 벗어나는 순간 자동으로 close 호출이 되어지면서 종료
        // try (FileOutputStream writer = new FileOutputStream(file)){
        try (FileInputStream reader = new FileInputStream(file)){
            // [1] 26개 알파벳 대문자 파일에 쓰기
            // 유니코드의 0 ~ 127까지는 아스키(ASCII) 코드와 호환 : 즉, 유니코드 체계에서도 아스키 코드는 유효
            // for(int i=65; i<65+26; i++){
            //     writer.write(i);
            // }
            // writer.flush();
            
            // [2] 26개 알파벳 대문자 파일에서 읽어오기 ~> 읽어와서 콘솔에 출력
            // read() 메서드는 int를 반환, 파일에서 한 바이트씩 읽기
            // System.out.println(file.length()); // 26
            
            // 따라서, 대문자 A 한 바이트를 읽어와서 콘솔에 출력시키면 그에 해당하는 65에 출력
            // System.out.println(reader.read()); // 65
            
            // read() 메서드 특징 => 파일에 읽어올게 더 남아있다면 계속 순차적으로 다음 바이트를 가져옴
            // System.out.println(reader.read()); // 66
            // System.out.println(reader.read()); // 67
            // 더 이상 읽어올게 없으면 -1을 반환
            // 따라서, 변수를 하나 만들어 거기에 읽어온 값을 담아서 반복문 사용하여 출력 ~> 이때 조건은 -1인지를 비교
            
            int data;
            while((data = reader.read()) != -1){
                System.out.println(data); // 65 66 65 .... 90
                System.out.println((char)data); // A B .. Z
            }

        } catch (Exception e) {
            System.out.println("File Output Error...!");
        }
    }
}
