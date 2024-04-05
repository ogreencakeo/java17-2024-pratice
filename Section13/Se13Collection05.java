package Section13;

import java.util.ArrayList;

public class Se13Collection05 {
    public static void main(String[] args) {
        // [2] 타겟 배열에서 원본 배열에 있는 값 삭제하기
        ArrayList<String> origin = new ArrayList<>();
        ArrayList<String> target = new ArrayList<>();

        // 원본 리스트에 추가
        origin.add("Superman");
        origin.add("Batman");
        origin.add("Antman");
        
        // 타겟 리스트에 추가
        target.add("Wonderwomen");
        target.add("Superman");
        target.add("Antman");

        // 타겟 리스트를 반복문 돌면서 요소가 원본에 포함되어 있으면 삭제
        for(int i=target.size()-1; i>=0; i--){
            if(origin.contains(target.get(i))) target.remove(i);
        }

        System.out.println(target); // [Wonderwomen]
    }
}
