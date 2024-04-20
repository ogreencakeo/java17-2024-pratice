package Section15.Bank;
// 사용자 정의 예외 클래스
public class BalanceExceptionEx extends Exception{
    public BalanceExceptionEx(){

    }

    public BalanceExceptionEx(String message){
        super(message);     // 조상 클래스의 생성자 호출
    }

}
