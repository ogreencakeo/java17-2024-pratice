package Section13;

import java.util.ArrayList;
import java.util.Collections;

public class Se13Collection06 {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 - 배열리스트 (ArrayList) : 사용자 정의 객체 정렬하기

        // 배열리스트 객체 생성
        ArrayList<EPerson> list = new ArrayList<>();

        // EPerson 객체 생성
        EPerson e1 = new EPerson("슈퍼맨", 20);
        EPerson e2 = new EPerson("베트맨", 30);
        EPerson e3 = new EPerson("엔트맨", 24);

        // 배열 리스트에 객체 담기
        list.add(e1);
        list.add(e2);
        list.add(e3);

        // 배열 리스트에 담긴 객체 정보 출력
        for(int i=0; i<list.size(); i++){
            System.out.printf("list.get(%d) => %s \n", i, list.get(i));
        }

        // 정렬하기
        
    }
}

class EPerson{
    // Field
    String name;
    int age;

    // Constructor
    public EPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    public String toString(){
        return String.format("Person : {name : %s, age : %d}",name, age);
    }
}
