package Section13;

import java.util.ArrayList;

public class Se13Collection03 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - 배열리스트(ArrayList) 사용자 정의 객체 저장

        // 베열 리스트 객체 생성
        ArrayList<CPerson> list = new ArrayList<>();

        // Cperson 객체 생성
        CPerson cperson1 = new CPerson("Superman",22);
        CPerson cperson2 = new CPerson("Batman",27);
        CPerson cperson3 = new CPerson("Antman",40);

        // 배열 리스트에 객체 담기
        list.add(cperson1);
        list.add(cperson2);
        list.add(cperson3);

        // 배열 리스트에 담긴 객체 정보 출력
        // System.out.printf("list.get(%d) => %s", 0, list.get(0));
        // System.out.println(cperson1);

        for(int i=0; i<list.size(); i++){
            System.out.printf("list.get(%d) => %s", i, list.get(i));
        }
    }
}

class CPerson{
    // Field
    private String name;
    private int age;

    // Constructor
    CPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    public String toString(){
        return String.format("Person {name : %s, age %d } \n", name, age);
    }
}