package Section04;

public class sec04If01 {
    public static void main(String[] args) {
        /*
         * ◆ if
         * if + boolean 조합 많이 사용
         * -> 조건 자체가 '참'임을 이용할 수 있음
         */
        
        int supermanAge = 10;
        if(supermanAge >= 19){
            System.out.println("성인입니다.");
        }else{
            System.out.println("미성년자 입니다.");
        }

        /*
            조건이 true, false 인지를 활용
        */
        boolean value = false;
        if(value){
            System.out.println("value 값이 : 참");
        }else{
            System.out.println("value 값이 : 거짓");
        }

        if(true){
            System.out.println("value 값이 : 참");
        }

        /* 
            ◆ if ~ else if ...
            여러 개 조건을 비교해서 분기
            조건을 위에 주냐 아래에 주냐에 따라서 결과가 달라질 수 있으므로 주의
            먼저 조건에 걸리면 출력하므로 조건을 걸 때 주의
            마지막 else 구문은 안써도 됨
        */
        // Question. 20~30대 까지는 '청년입니다' 출력하고, 40~50대면 '중년입니다.' 60대 이상은 '장년입니다.' 출력하시오
        int age = 40;
        if(age >= 20 && age<40){
            System.out.println("청년입니다");
        }else if(age >= 40 && age<50){
            System.out.println("중년입니다.");
        }else if(age >= 60){
            System.out.println("장년입니다.");
        }

        /*
         * if + boolean 같이 사용하기 
         * -> 제어문 자체가 불리언 값하고 같이 많이 사용
         */
        boolean isSuperman = true;
        String msg = null;

        if(isSuperman){
            msg = "슈퍼맨 맞아용";
        }else{
            msg = "슈퍼맨 아니에용";
        }

        System.out.println(msg);

        // 삼항 연산자
        // -> 특히 프론트엔드 프레임워크에서는 거의 if문 대신으로 많이 사용
        boolean isWonderWoman = true;
        String msg2 = null;

        msg2 = isWonderWoman ? "원더우먼 맞아용" : "원더우먼 아니에용";

        System.out.println(msg2);
    }
}
