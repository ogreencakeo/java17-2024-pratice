package Section16.example04;

import javax.swing.JOptionPane;

public class TimerEx {
    public static void main(String[] args) throws Exception{
        Thread thread = new Timer();
        thread.start();

        String input = JOptionPane.showInputDialog("10초 안에 값을 입력하시오 : ");

        if(input != null){
            System.out.println("입력 값 : " + input);
            System.exit(0);
        }else{
            Thread.sleep(100000); // 10초를 대기한다.
            System.out.println("입력하지 못했습니다 펑!");
            System.exit(0);
        }

    }
}
