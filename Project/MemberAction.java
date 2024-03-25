package Project;

import java.util.Scanner;

// 회원 한 명에 대한 객체 정보를 실제적으로 처리하는 여러 액션 작업을 수행하는 클래스

public class MemberAction {
    // 회원 입력
    public void memberInsert(Scanner sc){
        // 회원 추가 입력 가능한지 체크
        int a = MemberData.members.length;
        int b = memberCount();
        if(b >= a){
            System.out.println("Sorry..! 배열이 꽉 찼습니다.");
            return;
        }
        
        System.out.print("이름 >> ");
        String name = sc.next();
        System.out.print("전화 >> ");
        String hp = sc.next();
        System.out.print("이메일 >> ");
        String eml = sc.next();

        // 회원 카운트 넘버 세기 -> 배열에 회원 몇명 들어있는지 체크
        int cnt = memberCount();
        
        // 사용자 입력을 통해 받은 값으로 memberDTO 객체 생성
        MemberDTO member = new MemberDTO(cnt, name, hp, eml);
        System.out.println(member);

        // 입력 요청
        memberInsertOk(member);
    }

    // 입력 요청
    public void memberInsertOk(MemberDTO member){
        MemberData.members[member.getNo()] = member;
    }

    // 회원리스트
    public void memberList(){
        System.out.println("=== 현재 배열의 길이 : " + MemberData.members.length + " ===");
        System.out.println("현재 회원의 수 : " + memberCount() + "명 ");
        for(MemberDTO m : MemberData.members){
            if(m == null) break;
            else System.out.println(m);
        }
    }

    // 카운트 증가
    public int memberCount(){
        int cnt = 0;
        for(MemberDTO m : MemberData.members){
            if(m == null) break;
            else cnt++;
        }
        return cnt;
    }

}
