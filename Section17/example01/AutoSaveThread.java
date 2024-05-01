package Section17.example01;

// AutoSaveThread 클래스는 작업 내용을 주기적으로 저장하는 데몬스레드를 구현한다.
public class AutoSaveThread extends Thread{
    
    // 작업 내용을 저장하는 메서드
    public void save(){
        System.out.println("작업 내용을 저장함");
    }

    // 스레드 실행 시 주기적으로 save() 메서드를 호출하여 작업 내용을 저장한다.
    @Override
    public void run() {
        // 1초 단위로 save() 메서드 호출함
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            
            this.save();
        }
    }
}
