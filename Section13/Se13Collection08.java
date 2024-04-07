package Section13;

import java.util.ArrayList;
import java.util.Collections;

public class Se13Collection08 {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 - 배열리스트 (ArrayList) : 사용자 정의 객체 정렬하기

        // 배열 리스트 객체 생성
        ArrayList<EPersonSec08> list = new ArrayList<>();

        EPersonSec08 e1 = new EPersonSec08("B", 30);
        EPersonSec08 e2 = new EPersonSec08("A", 18);
        EPersonSec08 e3 = new EPersonSec08("C", 20);

        list.add(e1);
        list.add(e2);
        list.add(e3);

        Collections.sort(list);

        for(EPersonSec08 person : list){
            System.out.println(person);
        }
    }
}

class EPersonSec08 implements Comparable<EPersonSec08>{
    private String name;
    private int age;

    public EPersonSec08(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(EPersonSec08 other) {
        // [3] Person 객체를 age 값으로 정렬되도록 구현하는 다른 방법 : if, else
        // 오름차순
        if(this.age < other.age) return -1; 
        else if(this.age == other.age) return 0;
        else return 1;
    }

    @Override
    public String toString() {
        return String.format("Person {name : %s, age : %d}", name, age);
    }
}