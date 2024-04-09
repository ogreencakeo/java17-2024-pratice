package Section14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Se14Collection02 {
    public static void main(String[] args) {
        // HashMap 객체 생성
        HashMap<String, String> map = new HashMap<>();

        // 요소 추가 : key, value
        map.put("superman", "su1234");
        map.put("battman", "bat1234");
        map.put("antman", "an1234");
        map.put("wonderwomen", "won1234");
        map.put("ironman", "ir1234");

        // key만 출력 : keySet()
        Set<String> ks = map.keySet();
        System.out.println(ks);

        // 한 개 요소만 키 지정해서 가져오기 : get() => 이때, Object 타입으로 받아서 가져오니 강제 형변환 해서 사요
        String val = (String) map.get("wonderwomen");
        System.out.println("key가 wonderwomen에 해당 하는 값 : " + val);

        // 반복문 사용해서 모든 엔트리 출력 : entrySet()
        System.out.println("-----------------------------------------");

        for( Map.Entry<String, String> e : map.entrySet()){
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key + " : " + value);
        }
        
        System.out.println("-----------------------------------------");
    }
}
