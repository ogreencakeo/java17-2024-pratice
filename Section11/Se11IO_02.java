package Section11;

import java.io.File;

public class Se11IO_02 {
    public static void main(String[] args) {
        // Qustion
        // 파일인지 폴더(디렉토리)인지 구분하여 보시오.
        File file1 = new File("Section11"); // Directory
        File file2 = new File("sample.TxT"); // File

        // [1] 파일인지? 폴더인지? 판단
        System.out.println("================================");
        if(file1.isFile()) System.out.println("파일입니다.");
        else System.out.println("파일이 아닙니다.");

        // 만약, 없는 파일명으로 테스트한다면 ? -> isFile()은 아무튼 파일이 없으면 false를 반환

        // [2] 파일 크기가 만약 0이면? -> isFile() -> 파일 이름이 있고, 해당 경로에 존재 -> true 반환
        System.out.println("================================");
        System.out.println("sample.txt 파일 크기 : " + file2.length());
        if(file2.isFile()) System.out.println("파일입니다.");
        else System.out.println("파일이 아닙니다.");
        
        // [3] 디렉토리인지 ? 아닌지 ? 판단
        System.out.println("================================");
        if(file2.isDirectory()) System.out.println("디렉토리입니다.");
        else System.out.println("디렉토리가 아닙니다.");
        
        // [4] 대소문자 구분은 ?? -> 기본적으로 대소문자 구분 X
        System.out.println("================================");
        System.out.println(file1.getName()); // Section11
        System.out.println(file2.getName()); // sample.TxT

        // equals() : 대소문자 구분
        // equalsIngoreCase() : 대소문자 무시
        System.out.println("파일명 일치 => " + file2.getName().equals("sample.txt")); // false
        System.out.println("파일명 일치 => " + file2.getName().equalsIgnoreCase("sample.txt")); // true
    
        // [5] 간단 작성
        if(file1.isDirectory()) System.out.println(file1.getName() + " is a directory.");
        if(file2.isFile()) System.out.println(file2.getName() + " is a file.");
    }
}
