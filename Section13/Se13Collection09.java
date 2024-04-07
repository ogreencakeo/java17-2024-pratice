package Section13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Se13Collection09 {
    public static void main(String[] args) {
        // 정렬 비교 - 배열 (Array) vs 배열 리스트 (ArrayList) 정렬 비교 및 Comparator 비교자로 정렬 적용하기
        // - Array      : 전통적인 배열, 길이 고정
        // - ArrayList  : 컬렉션, 길이 가변적

        System.out.println("---------------------------배열 정렬");
        exam01();

        System.out.println("---------------------------배열 리스트 정렬");
        exam02();

        System.out.println("---------------------------문자열 길이로 정렬");
        exam03();
    }

    public static void exam01(){
        String [] animals = { "Tiger", "Lion", "Alligator", "111", "atom", "강감찬", "홍길동" };
        // 오름차순 정렬 ~> 숫자 > 대문자 > 소문자 > 한글
        // Collections.sort(animals); // error
        Arrays.sort(animals); // 적용

        for(String str : animals) {System.out.println(str);}

        // 내림차순 정렬
        Arrays.sort(animals, Collections.reverseOrder());
        for(String str : animals) {System.out.println(str);}
    }

    public static void exam02(){
        // 배열 리스트 객체 생성
        ArrayList<String> list = new ArrayList<>();

        // 추가
        list.add("111");
        list.add("aaa");
        list.add("강감찬");
        list.add("AAAA");
        list.add("홍길동");
        list.add("BBB");

        Collections.sort(list); // 적용
        for(String str : list){System.out.println(str);}
        
        Collections.sort(list, Collections.reverseOrder()); // 내림차순
        for(String str : list){System.out.println(str);}
    }

    public static void exam03(){
        
    }
}
