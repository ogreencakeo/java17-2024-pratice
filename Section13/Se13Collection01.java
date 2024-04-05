package Section13;

import java.util.ArrayList;
import java.util.Collections;

public class Se13Collection01 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - 배열리스트 (ArrayList)
        // - 배열과 비슷 ~> "더 좋아진 배열", "업그레이드 배열" 등 배열과 매우 유사한 특징을 가짐
        // - 그 이유는 List가 내부적으로 배열을 이용하기 때문
        // - 가장 큰 차이점 ~> 길이가 가변적이라 길이에 대한 고민을 할 필요가 없음
        // - List는 인터페이스이기 때문에 객체를 생성할 수 없으므로 이를 상속 구현한 구현체 (ArrayList)를 통해서 객체를 생성하고 사용

        // 주요 메서드
        // - 추가 : add()
        // - 삭제 : remove()
        // - 길이 : size() != length()
        // - 수정 : set()
        // - 출력 : get()
        // - 정렬 : Collections.sort(컬렉션 명)

        // 제네릭 기반
        // - 꼭 제네릭 문법을 써야하는 것은 아니나 경고가 출력
        // - 제네릭 문법을 사용하지 않고 Object 타입으로 받아서, 출력시는 강제 형 변환하여 사용 -> 가능하나 거의 사용하지 않음

        ArrayList<Integer> list = new ArrayList<>();

        // 추가 add()
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        // 사이즈 출력
        System.out.println(list.size() + "\n"); // 5

        // 전체 출력 : 전통적인 for문 + get() 메서드 사용 , 향상된 for문
        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // } 
        for(int l : list){
            System.out.println(l);
        }

        // 삭제 : remove()
        list.remove(4);
        System.out.println("\n" + list.size() + "\n");

        // 수정 : set()
        list.set(2, 3000);

        for(int l : list){
            System.out.println(l);
        }

        // 정렬
        System.out.println();
        // Collections.sort(list); // 오름차순 정렬
        Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬

        // 출력
        for(int l : list){
            System.out.println(l);
        }
    }
}
