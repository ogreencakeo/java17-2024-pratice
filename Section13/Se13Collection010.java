package Section13;

import java.util.LinkedList;
import java.util.List;

public class Se13Collection010 {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 - 링크드리스트, 스택, 큐
        testLinkdeList();
        System.out.println("---------------------------링크드리스트");

        // 백터의 경우는 나중에 사용하고자 할 때 들여다보면 되고, 배열리스트와 거의 같으므로 이것을 사용하면 됨
        // 한가지 기억할 것은 Stack 클래스는 Vector 클래스를 상속받아 만들어진 것

        // testStack();
        System.out.println("---------------------------스텍");

        // testQueue();
        System.out.println("---------------------------큐");
    }

    public static void testLinkdeList(){
        // 링크드리스트 객체 생성 
        // LinkedList<String> list = new LinkedList<>();
        List<String> list = new LinkedList<>();
        
        // 요소 추가
        list.add("Superman");
        list.add("Batman");
        list.add("Antman");
        list.add("Wonderwomen");
        list.add("Ironman");

        // 요소 출력
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // 요소 삭제
        list.remove(3);

        // 요소 수정
        list.set(list.size()-1, "ironman");

        // 다시 출력
        System.out.println(list);
    }
}
