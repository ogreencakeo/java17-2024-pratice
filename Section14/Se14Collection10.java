package Section14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Se14Collection10 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - Comparator 인터페이스를 구현하여 내림차순 정렬하기
        // TreeMap 객체 생성 : 기본은 키로 오름차순 정렬
        TreeMap<Integer, String> map = new TreeMap<>(){{
            put(10000, "참외");
            put(15000, "포도");
            put(20000, "포도");
            put(30000, "사과");
            put(50000, "체리");
            put(40000, "수박");
        }};

        // 오름차순 정렬
        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        } 

        System.out.println("------------------------------------");

        // 키를 내림차순 정렬하여 출력하시오
        // TreeMap 객체 생성 : 이때, 구현한 FruitsComparator 를 인자로 전달하면서 생성
        TreeMap<Integer, String> tmap2 = new TreeMap<>(new FruitsComparator()){{
            put(10000, "참외");
            put(20000, "포도");
            put(30000, "사과");
            put(50000, "체리");
            put(40000, "수박");
        }};

        // 내림차순 정렬
        for(Map.Entry<Integer, String> desc : tmap2.entrySet()){
            System.out.println(desc);
        } 

    }
}

// Comparator 인터페이스 구현
class FruitsComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}