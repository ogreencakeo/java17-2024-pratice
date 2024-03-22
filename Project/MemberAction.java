package Project;

import java.util.Scanner;

// 회원 한 명에 대한 객체 정보를 실제적으로 처리하는 여러 액션 작업을 수행하는 클래스

public class MemberAction {
    public void memberInsert(Scanner sc){
        System.out.print("이름 >> ");
        String name = sc.next();
        System.out.print(name);
    }

    public void memberInsertOk(){
        System.out.println("== 회원 객체 한 명을 배열에 저장하는 메서드 ==");
    }
}
