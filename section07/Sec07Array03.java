package Section07;

public class Sec07Array03 {

    public static void main(String[] args) {
        // 배열의 크기를 사용자 입력 또는 변수 지정을 통해서 생성
        int arrNum = 3; // 사용자 입력을 통해 받은 배열의 크기

        String memberName[] = new String[arrNum];
        int memeberAge[] = new int[arrNum];
        String memberEmails[] = new String[arrNum];

        // 회원이름 등록
        memberName[0] = "홍길동";
        memberName[1] = "이순신";
        memberName[2] = "김유신";

        // 회원나이 등록
        memeberAge[0] = 22;
        memeberAge[1] = 32;
        memeberAge[2] = 42;

        // 회원 이메일 등록
        memberEmails[0] = "hong@gmail.com";
        memberEmails[1] = "lee@gmail.com";
        memberEmails[2] = "kim@gmail.com";

        // 출력
        for(int i=0; i<arrNum; i++){
            System.out.printf("%d번의 회원님의 이름은 %s이고, 이메일은 %s이고, 나이는 %d 입니다.\n", 
            i+1, memberName[i], memberEmails[i], memeberAge[i]);
        }
    }
}