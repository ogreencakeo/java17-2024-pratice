package Project;

import java.util.Scanner;

// 회원 한 명에 대한 객체 정보를 실제적으로 처리하는 여러 액션 작업을 수행하는 클래스

public class MemberAction {
    public void memberInsert(Scanner sc){
        System.out.print("이름 >> ");
        String name = sc.next();
        System.out.print("전화 >> ");
        String hp = sc.next();
        System.out.print("이메일 >> ");
        String email = sc.next();
        System.out.printf("회원정보 : [이름 : %s, 전화번호 : %s, 메일 : %s]\n",
                            name, hp, email);
    }

    public void memberInsertOk(){
        System.out.println("== 회원 객체 한 명을 배열에 저장하는 메서드 ==");
    }
}
