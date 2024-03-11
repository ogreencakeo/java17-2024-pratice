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

    }
}
