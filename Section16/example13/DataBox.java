package Section16.example13;

// 공유 객체
public class DataBox {
    private String data;

    public synchronized String getData(){
        // 읽어올 데이터가 없다면 대기
        if(this.data == null){
            try {
                wait(); // 소비자 스레드를 대기 상태로 전환
            } catch (InterruptedException e) {}
        }

        // 데이터 읽기
        String returnValue = this.data;
        System.out.println("ConsumerThread가 읽은 데이터 : " + this.data);
        this.data = null; // 데이터를 소비한 후 null로 초기화
        notify(); // 생산자 스레드에게 데이터 생산 요청
        return returnValue;
    }

    // Consumer 스레드가 데이터를 소비하지 않았더라면...
    public synchronized void setData(String data){
        // 데이터가 있으면 대기
        if(this.data != null){
            try {
                wait(); // 생산자 스레드를 대기 상태로 전환
            } catch (InterruptedException e) {}
        }

        // 데이터 저장
        this.data = data;
        System.out.println("ProducerThread가 생성한 데이터 : " + this.data);
        notify(); // 소비자 스레드에게 데이터 소비 요청
    }
}
