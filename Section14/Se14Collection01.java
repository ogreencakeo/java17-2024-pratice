package Section14;

import java.util.HashSet;
import java.util.Iterator;

public class Se14Collection01 {
    public static void main(String[] args) {
        // HashSet 객체 생성
        HashSet<String> set = new HashSet<>();

        // 요소추가
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        // 출력
        System.out.println(set);

        // 제거
        set.remove("C");
        System.out.println(set);

        // 다시 p 추가
        set.add("P");
        System.out.println(set); 

        // 다시 C 추가하기
        set.add("C");
        System.out.println(set); // 순서에 상관없이 저장되므로 순서를 생각할 필요가 없다.

        // 중복 값 추가 : 먼저, 사이즈 계산해보고 시도
        System.out.println("현재 사이즈 : " + set.size()); // 6
        set.add("C");
        System.out.println("현재 사이즈 : " + set.size()); // 6 : 사이즈 변화가 없음, 즉 중복된 값은 허용 X

        // get() 메서드 사용해서 값 가져오기
        // System.out.println(set.get(0)); // error
        // HashSet은 데이터를 순서에 상관없이 저장하기 때문에 인덱스로 데이터를 접근할 수 없다.
        // HashSet은 내부적으로 HashMap을 사용하여 데이터를 처리하기 때문에 중복을 없앨 수 있다.

        // contains() 메서드를 사용하여 값 포함 여부 체크
        System.out.println("Y가 포함되었나요? => " + set.contains("Y")); // false
        System.out.println("Y가 포함되었나요? => " + set.contains("A")); // true
        System.out.println("Y가 포함되었나요? => " + set.contains("a")); // false

        // 전체 출력
        for(String s : set){
            System.out.print(s + ", ");
        }

        // 전체 출력 ~? iterator() 반복자 객체를 만들어서 반복
        System.out.println("\n" + "=== 반복자 사용해서 출력 ===");
        Iterator iter = set.iterator();
        
        // hashNext() : 반복자가에 다음 데이터가 있는지 체크 ~> true, false
        while(iter.hasNext()){
            // 다음 데이터 가져오기
            System.out.print(iter.next() + ", ");
        }
    }
}
