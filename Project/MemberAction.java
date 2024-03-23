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
        String eml = sc.next();

        // 회원 카운트 넘버 세기 -> 배열에 회원 몇명 들어있는지 체크
        int cnt = 0;
        
        // 사용자 입력을 통해 받은 값으로 memberDTO 객체 생성
        MemberDTO member = new MemberDTO(cnt, name, hp, eml);
        System.out.println(member);
    }

    public void memberInsertOk(){
        System.out.println("== 회원 객체 한 명을 배열에 저장하는 메서드 ==");
    }
}
