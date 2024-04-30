package Section16.example13;

public class WaitNotifyEx {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();

        ConsumerThread consumerThread = new ConsumerThread(dataBox);
        ProducerThread producerThread = new ProducerThread(dataBox);

        consumerThread.start();
        producerThread.start();
    }
}
