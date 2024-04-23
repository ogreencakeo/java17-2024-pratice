package Section16.pra;

import javax.swing.JOptionPane;

public class Jimin {
    public static void main(String[] args) throws Exception {
        Thread thread = Thread.currentThread();
        System.out.println("시작 스레드명 : " + thread.getName());

        Thread threadA = new ThreadA();
        threadA.start();
        System.out.println("[ ThreadeA를 생성한 스레드 이름 ] : " + thread.currentThread().getName());
        System.out.println("[ main스레드가 ThreadA의 이름을 가져온 것 ] : " + threadA.currentThread().getName());

        ThreadB threadB = new ThreadB();
        System.out.println("[ ThreadB를 생성한 스레드 이름 ] : " + thread.currentThread().getName());
        System.out.println("[ main스레드가 ThreadBd의 이름을 가져온 것 ] : " + threadB.currentThread().getName());
        threadB.start();

    }   
}

class ThreadA extends Thread{
    ThreadA(){
        this.setName("ThreadA");
    }
    @Override
    public void run() {
        System.out.println("현재 실행 중인 스레드 : " + this.getName());
        for(int i=0; i<5; i++){
            System.out.println(this.getName() + " 출력한 내용 : " + i);
        }
    }
}

class ThreadB extends Thread{
    ThreadB(){
        this.setName("ThreadB");
    }
    @Override
    public void run() {
        System.out.println("현재 실행 중인 스레드 : " + this.getName());
        for(int i=0; i<5; i++){
            System.out.println(this.getName() + " 출력한 내용 : " + i);
        }
    }
}