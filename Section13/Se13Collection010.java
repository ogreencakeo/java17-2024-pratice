package Section13;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Se13Collection010 {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 - 링크드리스트, 스택, 큐
        testLinkdeList();
        System.out.println("---------------------------링크드리스트");

        // 백터의 경우는 나중에 사용하고자 할 때 들여다보면 되고, 배열리스트와 거의 같으므로 이것을 사용하면 됨
        // 한가지 기억할 것은 Stack 클래스는 Vector 클래스를 상속받아 만들어진 것

        testStack();
        System.out.println("---------------------------스텍");

        testQueue();
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
        // 스택 객체 생성
        // Deque<Integer> stack = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        // 스택에 요소 추가
        stack.push(7);
        stack.push(9);
        stack.push(5);
        stack.push(3);
        stack.push(6);

        // 스택에서 요소 반환
        System.out.println(stack.peek()); // 6
        System.out.println(stack); // [7, 9, 5, 3, 6]    
        
        // 스택에서 요소 반환 + 삭제
        System.out.println(stack.pop()); // 6
        System.out.println(stack); // [7, 9, 5, 3]

        // 요소 검색 : serach
        // 만약 스택에 없는 값을 검색하면 ? : -1 출력
        System.out.println(stack.search(3)); // 1
        System.out.println(stack.search(7)); // 4
        System.out.println(stack.search(9)); // 3
        System.out.println(stack.search(0)); // -1

        // 인덱스로 값 가져오기 : get() 메서드 사용
        System.out.println("0번째 인덱스에 있는 값 : " + stack.get(0)); // 7
        System.out.println("0번째 인덱스에 있는 값 : " + stack.get(stack.size() - 1)); // 3


        // 스택에 있는 요소 수 구하기
        System.out.println("현재 요소 수 : " + stack.size()); // 4

        // 스택이 비었는지 체크
        System.out.println("스택이 비었나요 ? : " + stack.empty()); // false

        // 스택 요소 전체 출력
        // 7 9 5 3
        for(int i=0; i<stack.size(); i++){
            if(i == stack.size()-1)  System.out.println(stack.get(i));
            else  System.out.print(stack.get(i) + ", ");
        }
        // 향상된 for문
        // for(int i : stack){
        //     System.out.println(i);
        // }

        stack.pop();

        // 스택에 쌓인 순서대로 출력 (거꾸로 출력)
        // 5 9 7
        for(int i=stack.size()-1; i>=0; i--){
            if(i==0) System.out.println(stack.get(i));
            else System.out.print(stack.get(i) + ", "); 
        }

        // 스택 비우기
        stack.clear();
        System.out.println("스택 비었나요 ? : " + stack.empty()); // true
    }

    public static void testQueue(){
        // 큐 객체 생성
        LinkedList<String> queue = new LinkedList<>();

        // 큐에 요소 추가
        queue.add("홍길동");
        queue.add("이순신");
        queue.add("강감찬");

        // 큐에 있는 요소 반환 : 스택과 헷갈리지 말기
        System.out.println(queue.peek()); // 홍길동
        System.out.println(queue); // [홍길동, 이순신, 강감찬]
        
        // 큐에 있는 요소 반환 + 삭제
        System.out.println(queue.poll()); // 홍길동
        System.out.println(queue); // [이순신, 강감찬]
        
        // 값으로 요소 삭제
        queue.remove("이순신");
        System.out.println(queue); // [강감찬]
        
        // 큐에 있는 요소 수 구하기
        System.out.println("현재 큐의 요소 수는 ? : " + queue.size()); // 1
        
        // 큐 비었는지 체크
        System.out.println("큐 비었나요 ? : " + queue.isEmpty()); // false
        
        // 큐 비우기
        queue.clear();
        System.out.println("큐 비었나요 ? : " + queue.isEmpty()); // true
        
        // 추가
        queue.add("광개토 대왕");
        queue.add("장수왕");
        queue.add("세종대왕");

        System.out.println();
        // 전체 출력
        for(String s : queue){
            System.out.println(s);
        }

        // 맨 앞에 있는 요소 반환 : element()
        System.out.println("맨 앞에 있는 요소는 ? : " + queue.element()); // 광개토 대왕

        // 정조 세종대왕 장수왕 광개토 대왕
        // offer 메서드
        queue.offer("정조");
        System.out.println(queue); // [광개토 대왕, 장수왕, 세종대왕, 정조]
        System.out.println("peek() 사용 : " + queue.peek()); // 광개토 대왕
        System.out.println("element() 사용 : " + queue.element()); // 광개토 대왕
        System.out.println(queue.get(queue.size()-1)); // 정조
        
        
        // offerFirst 메서드
        queue.offerFirst("영조"); 
        System.out.println(queue); // [영조, 광개토 대왕, 장수왕, 세종대왕, 정조]
        System.out.println(queue.element()); // 영조

        // 인덱스 2번에 삽입하기
        queue.add(2, "이성계");
        System.out.println(queue); // [영조, 광개토 대왕, 이성계, 장수왕, 세종대왕, 정조]
    }
}
