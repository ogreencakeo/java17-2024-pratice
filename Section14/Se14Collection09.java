package Section14;

import java.util.Map;
import java.util.TreeMap;

public class Se14Collection09 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - 앞서 예제를 반대로 고쳐서 TreeMap 복습하기

        // TreeMap 객체 생성 + 초깃값 설정 (요소 추가)
        TreeMap<Integer, String> map = new TreeMap<>(){{
            put(10000, "참외");
            put(20000, "포도");
            put(30000, "사과");
            put(50000, "체리");
            put(40000, "수박");
        }};

        System.out.println("------------------------------------- [1]");
        // [1] 모든 과일명과 가격을 전체 출력하시오.
        // 전체 출력 1 
        System.out.println("전체 출력 : " + map);
        
        // 전체 출력 2 : map.entrySet()
        System.out.println("++++++++++++++++++++++++");
        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        
        // 전체 출력 3 : map.keySet()
        System.out.println("++++++++++++++++++++++++");
        for(Integer key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        
        System.out.println("------------------------------------- [2]");
        // [2] 포도 가격이 얼마인지 출력하시오? -> 요거는 좀 생각...
        for(Map.Entry<Integer, String> e : map.entrySet()){
            if(e.getValue().equals("포도")){
                System.out.println(e.getValue() + "의 가격은 " + e.getKey() + "입니다.");
                break;
            }
        }

        System.out.println("------------------------------------- [3]");
        // [3] 과일 중 가격이 가장 싼 과일은?
        System.out.println("가장 싼 과일의 가격은(가장 작은 키는)? : " + map.firstKey());
        System.out.println("가장 작은 요소는 ? : " + map.firstEntry());
        System.out.println("가장 비싼 과일의 가격은(가장 큰 키는)? : " + map.lastKey());
        System.out.println("가장 큰 요소는 ? : " + map.lastEntry());
        
        System.out.println("------------------------------------- [4]");
        // [4] 과일 중 포도의 가격을 22000원으로 수정하고 싶다면?
        map.put(22000, "포도");
        System.out.println(map);
        
        System.out.println("------------------------------------- [5]");
        // [5] 메서드 반환 값 받기
        // (문제1) 트리맵에서 첫 번째 요소를 출력하려면 ? ~~> firstEntry()
        // (문제2) 트리맵에서 마지막 번째 요소를 출력하려면 ? ~~> lastEntry()
        // (문제3) 트리맵 전체 요소들을 반복문 사용해서 출력하려면 ? ~~> entrySet()
        // (문제4) 트리맵 키들만 출력하려면 ? ~~> keySet()

        System.out.println("------------------------------------- [6]");
        // [6] lowerEntry() 메서드 사용하기
        // 언제 사용하지 ? ~~> 지정된 키보다 작은거에서 가장 큰 키를 찾을 수 있다.
        Map.Entry<Integer, String> entryL = map.lowerEntry(30000);
        System.out.println(entryL); // 22000=포도

        Map.Entry<Integer, String> entryH = map.higherEntry(30000);
        System.out.println(entryH); // 40000=수박

        System.out.println("------------------------------------- [7]");
        // [7] 가격이 가장 싼 과일의 이름을 알고 싶다면?
        System.out.println(map.firstEntry().getValue()); // 참외
    }
}
