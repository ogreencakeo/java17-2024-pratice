package Section09;

// 인터페이스와 다형성
// - 인터페이스 타입으로 구현체(자식클래스)와 객체를 담아 향상된 반복문을 사용하여 모두 출력하시오.

public class Se09Interface04 {
    public static void main(String[] args) {
        // 객체 생성 : 인터페이스 타입으로 객체를 받음
        // Arms sword = new Sword();
        // Arms rifle =  new Rifle();
        // Arms cannon =  new Cannon();

        // 메서드 호출
        // sword.attck();
        // rifle.attck();
        // cannon.attck();

        // 인터페이스 타입의 배열에 객체를 담아서 출력
        Arms arms[] = {new Sword(), new Rifle(), new Cannon()};

        // for 반복문 사용하여 배열에 들어있는 모두 객체의 메서드 호출
        for(int i=0; i<arms.length; i++){
            arms[i].attck();
        }

        System.out.println("-------------------");

        // 향상된 for문
        for(Arms a  : arms){
            a.attck();
        }
    }
}


interface Arms{ void attck(); }

class Sword implements Arms{ public void attck(){ System.out.println(">> 휙휙~"); } }
class Rifle implements Arms{ public void attck(){ System.out.println(">> 탕탕~"); } }
class Cannon implements Arms{ public void attck(){ System.out.println(">> 펑펑~"); } }