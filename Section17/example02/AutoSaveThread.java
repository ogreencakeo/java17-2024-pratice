package Section17.example02;
// AutoSaveThread 클래스는 작업 내용을 주기적으로 저장하는 데몬스레드를 구현합니다. 
// save() 메서드는 작업 내용을 저장하는 역할을 합니다. 
// run() 메서드에서는 1초마다 save() 메서드를 호출하여 작업 내용을 자동으로 저장합니다.

public class AutoSaveThread extends Thread{

    public void save(){
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            
            this.save();
        }
    }
}
