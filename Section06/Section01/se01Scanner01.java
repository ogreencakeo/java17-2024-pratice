package Section06.Section01;

import java.util.Scanner;

public class se01Scanner01 {
    public static void main(String[] args) {
        // 사용자 입력 : Scanner 클래스
        // - 공부하는 유저 입장에서 본다면 출력만 하면 지루한데 입력도 같이 하면 재밌음
        // - 자바에서 사용자 입력은 Scanner 클래스를 사용하는게 가장 편한 방법이나 다른 방법들도 있다는 것은 기억
        // - import java.util.Scanner; (임포트는 자동으로 삽입, 패키지와 클래스 사이)
        // - 전체적으로 사용법 자체는 어렵지 않으나 그래도 주의할 부분은 있다.
        // - 객체 변수명 : s, sc, scan, scanner
        // - Scanner 클래스의 주요 메서드
        //      s.next()            : dfnodsfnso dfnodsfn; 입력된 문자열에서 공백 전까지만 : dfnodsfnso
        //      s.nextLine()        : 한 줄 전체를 받아서 처리
        //      s.nextInt()         : 정수를 받아서 처리
        //      s.nextDouble()      : 실수를 받아서 처리
        //      trim                : 동)다듬다, 손질하다   명) 다듬기, 손질 -> 입력된 문자열의 앞뒤 공백 제거

        // [1]
        // 사용자 입력을 통해서 이름(문자열), 나이(정수), 몸무게(실수)를 받아서 출력하시오.
        // 객체 생성
        // Scanner sc = new Scanner(System.in);

        // // 입력받는 정보등을 저장할 변수 선언
        // String name;
        // int age;
        // double weight;

        // // 사용자 입력
        // System.out.print("이름을 입력하시오 : ");
        // name = sc.nextLine();

        // System.out.print("나이를 입력하시오 : ");
        // age = sc.nextInt();

        // System.out.print("몸무게를 입력하시오 : ");
        // weight = sc.nextDouble();

        // // 출력
        // System.out.println("-------------------");
        // System.out.printf("회원 이름 : %s\n", name);
        // System.out.printf("회원 나이 : %d살\n", age);
        // System.out.printf("회원 몸무게 : %fkg\n", weight);

        // [2]
        // Scanner 클래스로 사용자 입력 처리시 주의사항
        // 객체 생성
        Scanner sc2 = new Scanner(System.in);

        // 이상이 없는 경우
        System.out.println("나이와 이름을 입력하시오 : ");
        int age2 = sc2.nextInt();
        sc2.nextLine();
        String name2 = sc2.nextLine();

        // 출력
        System.out.printf("제 이름은 %s이고, 나이는 %d입니다. \n", name2, age2);


        // 객체 종료
        // sc.close();
        sc2.close();
    }  
}
