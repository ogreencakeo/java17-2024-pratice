package Project;

import java.util.Scanner;

// UI라는 단어에서 알 수 있듯이 메뉴 출력 등 전체적인 프로그램 디자인을 담당하는 클래스
// - 콘솔창에서 동작하는 프로그램이라 디자인이라고 하기에는 조금 어색

public class MemberUI {
    public void menu(){
        // System.out.println("== 메뉴 출력 ==");

        // 메뉴 만들기
        String[] menus = {
            "1. 회원 입력",
            "2. 회원 목록",
            "0. 종료"
        };

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        MemberAction action = new MemberAction();

        // 메뉴 입력
        boolean run = true;

        while(run){
            // 메뉴 출력
            System.out.println("----------------------");
            System.out.println("    메뉴 출력    ");
            System.out.println("----------------------");
            for(String menu : menus){
                System.out.println(menu);
            }
            System.out.println("----------------------");
            System.out.print(">> ");

            int command = sc.nextInt();

            switch(command){
                case 1:
                    System.out.println("\n");
                    System.out.println(">> 1번 회원 입력을 선택했습니다.");
                    action.memberInsert(sc);
                    System.out.println("\n");
                    break;
                case 2 :
                    System.out.println("\n");
                    System.out.println(">> 2번 회원 입력을 선택했습니다.");
                    System.out.println("\n");
                    break;
                case 0 :
                    System.out.println("\n");
                    System.out.println("----------------------");
                    System.out.println("감사합니다.");
                    System.out.println("----------------------");
                    run = false;
                    break;
                default :
                System.out.println(" >> 메뉴 번호 확인 후 다시 입력해주세요!");
                    break;
            }
        }

        sc.close();

    }
}
