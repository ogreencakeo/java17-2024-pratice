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

        testStack();
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

    public static void testStack(){
        // 스택
        // - Stack 클래스는 Vector 클래스를 상속받아 만들어진 것
        // - 후입선출 방식의 LIFO 방식으로 데이터 처리가 이루어지는 자료구조 형태
        // LIFO : Last In, First Out
        // 쉽게 말해, 가장 나중에 저장됨(push) 데이터가 가장 먼저 나오게(pop) 되는 자료구조

        // 스택 예
        // - Undo(언두) 기능           a   b   c   d
        // - 브라우저 뒤로가기, 역순으로 글자 출력하기 등등 ... 

        // 주요 메서드
        // - 각 메서드는 이름만 봐도 대충은 알 수 있으나 정확히 아는 것이 중요!
        // push()       스택의 맨 위에 요소 추가
        // pop()        스택의 맨 위에 있는(맨 마지막에 저장된) 요소를 반환하고, 해당 요소를 스택에 삭제
        // peek()       스택의 맨 위에 있는(맨 마지막에 저장된) 요소를 반환
        // empty()      스택이 비어있는지 체크하여 비었으면 true, 아니면 false 반환
        // search()     위치 반환 (주의! 맨 위에 위치해 있는 요소가 1부터 시작함)
        // size()       
        // clear()
    }
}
