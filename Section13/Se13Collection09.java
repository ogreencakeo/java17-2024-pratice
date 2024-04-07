package Section13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

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
        // 4 5 6 10 9
        String fruits[] = {"pear", "apple", "orange", "fineapple", "strawberry"};

        // 비교자(Comparator)를 만들어서 문자열 길이로 정렬하기
        // 방법 1 : Comparaotr<T> 인터페이스를 implements 해서 int 타입으로 반환하는 compare(T O1, T o2) 추상 메서드를 구현
        /////////////////////////////////////////////////////////////////////
        // class ComparatorLength implements Comparator<String>{
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.length() - o2.length(); // 오름차순
        //     }
        // }

        // // 객체 생성
        // Comparator<String> cl = new ComparatorLength();
        // Arrays.sort(fruits, cl); // 적용

        // 방법 2 : 람다식 사용해서 간결하게 한 줄로 작성
        ////////////////////////////////////////////////////////////////////
        // - 함수의 선언과 구현을 한 줄로 간결하게 표현한 식 -> 함수(메서드)
        // - 형식 : (매개변수) => 결과값
        // - 람다식은 간결하고 가독성 및 편리성이 뛰어나기 때문에, 함수 대신 람다식을 사용한 경우가 많다.
        Comparator<String> cl = ( o1,  o2) -> o1.length() - o2.length();
        // Arrays.sort(fruits, cl); // 오름차순 적용
        Arrays.sort(fruits, Collections.reverseOrder(cl)); // 내림차순 적용

        // 출력
        for(String str : fruits) System.out.println(str);
    }
}
