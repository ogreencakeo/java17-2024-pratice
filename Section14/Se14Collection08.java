package Section14;

import java.util.TreeMap;
import java.util.Map;

public class Se14Collection08 {
    public static void main(String[] args) {
        // TreeMap 객체 생성 + 초깃값 설정 (요소 추가)
        // TreeMap<Integer, String> map = new TreeMap<>();

        // // 요소 추가
        // map.put(2000, "사과");
        // map.put(1000, "수박");
        // map.put(3000, "귤");

        // System.out.println(map);

        // TreeMap 객체 생성 + 초깃값 설정(요소 추가)
        TreeMap<String, Integer> map = new TreeMap<>(){{
            put("참외", 10000);
            put("포도", 20000);
            put("사과", 30000);
            put("체리", 50000);
            put("수박", 40000);
        }};

        System.out.println("--------------------------------------[1]");
        // [1] 모든 과일명과 가격을 전체 출력하시오.
        // 전체 출력 1
        System.out.println("전체 출력 : " + map);

        // 전체 출력 2 ~> 중요! ~> 향상된 for 반복문
        for(Map.Entry<String, Integer> el : map.entrySet()){
            // String key = el.getKey();
            // Integer value = el.getValue();
            // System.out.println(key + " : " + value);
            // System.out.println(el);

            System.out.print(el.getKey() + " : " + el.getValue() + ", ");
        }

        // Map.Entry 객체
        // 1. map.entrySet() 메서드를 사용하여 트리맵의 모든 엔트리를 Map.Entry 객체로 변환
        // 2. Map.Entry 객체는 키와 값을 저장하는 두 개의 속성을 가지고 있는데 -> getKey(), getValue()
        
        // 전체 출력 3 ~> 중요! ~> 향상된 for 반복문 ~> map.keySet()
        System.out.println("\n-----------------------------------------------");
        for(String key : map.keySet()){
            // System.out.print(key + ", ");
            System.out.print(key + " : " + map.get(key) + ", ");
        }

        System.out.println("\n----------------------------------------------- [2]");
        // [2] 포도 가격이 얼마인지 출력하시오.
        // 값 한 개만 출력하는 문제 : get() 메서드 사용
        System.out.println("포도 한 송이 가격 : " + map.get("포도"));

        System.out.println("----------------------------------------------- [3]");
        // [3] 과일 중 가격이 가장 싼 과일은 ?
        // firstKey(), firstEntry() -> 이거는 키를 기준으로 최솟값을 가져오는 것
        System.out.println("가장 싼 과일(가장 작은 키는)? : " + map.firstKey()); // 사과
        System.out.println("가장 작은 요소는 ? : " + map.firstEntry()); // 사과=30000
        System.out.println("가장 비싼 과일은(가장 큰 키는) ? : " + map.lastKey()); // 포도
        System.out.println("가장 큰 요소는 ? : " + map.lastEntry()); // 포도=20000

        System.out.println("----------------------------------------------- [4]");
        // [4] 과일중에서 포도의 가격을 22000원으로 변경하고 싶다면?
        // 첫 번째 방법
        // map.put("포도", 22000);
        // System.out.println(map);

        // 두 번째 방법
        Integer price = map.get("포도");
        System.out.println("수정전 포도 가격 : " + price);
        price = 22000;
        map.put("포도", price);
        System.out.println(map);
    }
}