package section07;

public class Sec07Array02 {
    public static void main(String[] args) {
        // 배열 요소 반복문으로 출력하기

        // [1] 배열을 사용하지 않고 변수만 사용해서 출력
        // 출력 뿐만 아니라 회원 한 명에 대한 정보가 더 있을 수 있는데 매번 변수를 만들어 저장하는 것도 한계
        // 클래스와 객체를 사용
        // String member1_name = "홍길동",
        //     member2_name = "이순신",
        //     member3_name = "강감찬";

        // int member1_age = 20,
        //     member2_age = 25,
        //     member3_age = 27;

        // System.out.println("1번 회원의 이름은 " + member1_name + "이고, 나이는 " + member1_age + "살 입니다.");
        // System.out.println("2번 회원의 이름은 " + member2_name + "이고, 나이는 " + member2_age + "살 입니다.");
        // System.out.println("3번 회원의 이름은 " + member3_name + "이고, 나이는 " + member3_age + "살 입니다.");
        // System.out.println();

        // [2] 배열과 반복문 사용해서 출력
        String memberName[] = {"Superman", "Batman", "Antman", "Wonderwoman"};
        int memberAge[] = {11, 22, 33};

        // 배열의 길이
        System.out.println(memberName.length);  // 3
        System.out.println(memberAge.length);   // 3

        // 반복문 출력
        for(int i=0; i<memberName.length; i++){
            System.out.printf("%d번 회원님의 이름은 %s이고, 나이는 %d살 입니다 \n", i+1, memberName[i], memberAge[i]);
        }
    }
}
