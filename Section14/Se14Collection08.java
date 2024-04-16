package Section14;

import java.util.TreeMap;

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
    }
}
