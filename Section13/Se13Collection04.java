package Section13;

import java.util.ArrayList;

public class Se13Collection04 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - 배열리스트(ArrayList)
        // 1. 원본 배열, 타겟 배열 두 리스트에서 서로 겹치는 요소에 대해서만 가져오기 ~> 교집합 구하기
        // 2. 타겟 배열에서 원본 배열에 있는 값 삭제하기 ~> 반복문 돌면서 타겟 요소가 원본에 포함되어 있으면 객체

        // 배열 리스트 객체 생성
        ArrayList<String> origin = new ArrayList<>();
        ArrayList<String> target = new ArrayList<>();

        // 원본 리스트에 추가 (origin)
        origin.add("Superman");
        origin.add("Batman");
        origin.add("Antman");
        origin.add("Antman");

        // 타겟 리스트에 추가 (target);
        target.add("Wonderwomen");
        target.add("batman");
        target.add("Antman");
        target.add("Antman");

        // 출력
        System.out.println(origin);
        System.out.println(target);

        // [1]
        // retainAll() -> 유지하다, 보존하다 (preserve) : 겹치는 부분만 유지한다. (교집합 부분만)
        origin.retainAll(target); // 적용
        System.out.println(origin); // [Antman, Antman] => 대소문자 구분, 중복 값이 여러개면 모두 유지
        

    }
}
