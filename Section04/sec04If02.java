package Section04;

public class sec04If02 {
    public static void main(String[] args) {
        /*
         * Switch 조건문
         * - 변수의 값 또는 어떤 계산식의 결과 값에 따라 조건을 적용하여 분기 처리하는 방식
         * - 변수의 값?
         *      - key 라고도 함, key - value 구문
         *      1. 숫자값 사용 O
         *      2. 문자값 사용 O
         *      3. 논리값 사용 X -> boolean -> true, false
         *      4. enum 타입 사용 O
         */

        // 기본 틀
        /*
         * switch(변수 또는 key){
         *      case 값 1 : 
         *          수행할 코드 작성
         *          break;
         *      case 값 2: // 해주지 않으면 계속 수행..
         *          ....
         *          break;
         *      case 값 3 :
         *          ....
         *          break;
         *      default :
         *          어느 조건에도 걸리지 않았을 경우 디폴트 수행
         *          break;
         * }
        */

        // 기본 예제1
        int userChoice = 5;
        switch(userChoice){
            case 1:
                System.out.println("회원 레벨 1의 초딩 멤버입니다.\n");
                break;
            case 2:
                System.out.println("회원 레벨 2의 중딩 멤버입니다.\n");
                break;
            case 3:
                System.out.println("회원 레벨 3의 고딩 멤버입니다.\n");
                break;
            case 4:
                System.out.println("회원 레벨 4의 대딩 멤버입니다.\n");
                break;
            default :
                System.out.println("혹시 관리자?");
                AdminGroup.check();
                break;
        }
    }
}

class AdminGroup{
    public static void check(){
        System.out.println("관리자 체크중...");
    }
}
