package Project;

// 프로그램 진입점(시작점) 역할을 하는 main 메서드가 있는 메인 메서드

public class Main {
    public static void main(String[] args) {

        // 배열 테스트
        // System.out.println(MemberData.members.length); // 5

        // 메뉴 보여주기
        MemberUI ui = new MemberUI();
        ui.menu();

        // MemberDTO 사용해보기
        // MemberDTO m1 = new MemberDTO(0, "Superman", "010-111-111", "superman@gamil.com");
        // m1.printInfo();
        
        // eml을 public으로 설정하였기 때문에 가능
        // System.out.println(m1.eml);
        // m1.eml = "aaaaaaaa@aaaaa.com";
        // m1.printInfo();

        // toString 메소드
        // MemberDTO m1 = new MemberDTO(0, "Superman", "010-111-111", "superman@gamil.com");
        // System.out.println(m1); // System.out.println(m1.toString()); 똑같이 출력됨.
    }   
}
