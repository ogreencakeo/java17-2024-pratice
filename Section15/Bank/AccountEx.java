package Section15.Bank;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(50000);
        System.out.println("현재 잔액 : " + account.getBalance());

        try {
            // 예외처리 코드가 반드시 들어가야 함.
            // withdraw() 예외를 던지고 있으니...
            account.withdow(10000);
            account.withdow(50000);
            System.out.println("현재 잔액 : " + account.getBalance());
        } catch (BalanceExceptionEx e) {
            System.out.println("예외원인 : " + e.getMessage());
            // e.printStackTrace();
        }finally{
            System.out.println("정상종료");
        }
    }
}
