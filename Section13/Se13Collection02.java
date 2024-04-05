package Section13;

import java.util.ArrayList;
import java.util.Collections;

public class Se13Collection02 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - 배열리스트(ArrayList) 복습 및 다른 메서드 사용
        // - String 타입의 예제를 만들어보시오.

        // 객체 생성
        ArrayList<String> list = new ArrayList<>();

        // 컬렉션이 비어 있는지 체크 ~> isEmpty()
        System.out.println(list.isEmpty()); // true

        // 요소를 추가
        list.add("홍길동");
        list.add("이순신");
        list.add("강감찬");
        list.add("을지문덕");
        list.add("장수왕");
        list.add("이순신");

        // 컬렉션이 비어 있는지 체크 ~> isEmpty()
        System.out.println(list.isEmpty()); // false

        // 전체 출력 1
        for(String s : list){
            System.out.println(s);
        }

        // 전체출력 2
        System.out.println(list); // 배열 표시로 출력 => [홍길동, 이순신, 강감찬, 을지문덕, 장수왕, 이순신]

        // 요소 수정
        list.set(2, "김유신");

        // 요소 삭제
        list.remove(0);

        // 다시 출력
        System.out.println(list); // [이순신, 김유신, 을지문덕, 장수왕, 이순신]

        // 특정 요소가 컬렉션에 포함되어있는지 체크 : contains()
        System.out.println("김유신 포함 체크 : " + list.contains("김유신")); // true

        // 특정 요소에 인덱스를 반환 : indexOf()
        System.out.println("김유신 요소의 인덱스 : " + list.indexOf("김유신")); // 1

        // 특정 요소가 여러 개 있을 때 마지막 인데스를 반환 : lastIndexOf
        System.out.println("이순신 요소의 마지막 인덱스 : " + list.lastIndexOf("이순신")); // 4

        // 특정요소에 대한 빈도 수 -> Collections.frequency(컬렉션 명, 요소명)
        System.out.println("이순신 요소의 개수 : " + Collections.frequency(list, "이순신")); // 2

        // 깨끗하게 모두 삭제 -> clear()
        list.clear();
        System.out.println(list); // []
    }
}
