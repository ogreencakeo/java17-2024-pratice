package Section15.Bank;

public class Account {
    private long balance;

    Account(){

    }

    // 현재 잔액을 가져오기
    public long getBalance(){
        return this.balance;
    }

    // 입금하기
    public void deposit(int money){
        this.balance += money;
    }

    // 출금하기
    public void withdow(int money) throws BalanceExceptionEx{
        if(this.balance < money) {
            // 강제로 예외 발생
            throw new BalanceExceptionEx("잔액 부족");
        }
        this.balance -= money;
    }
}
