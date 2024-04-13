package Section14;

import java.util.Iterator;
import java.util.TreeSet;

public class Se14Collection06 {
    public static void main(String[] args) {
        // 데이터 생성
        int data[] = {3, 9, 7, 2, 1, 5, 4, 10, 6, 8};

        // 출력 1
        for(int x : data){
            System.out.print(x + " ");
        }

        // TreeSet 객체 생성
        TreeSet<Integer> ts = new TreeSet<>();

        // ts 자료구조에 데이터 저장 : add()
        for(int i=0; i<data.length; i++){
            ts.add(data[i]);
        }

        // 출력 2
        System.out.println( "\n" + ts);

        // 출력 3
        // 반복자 만들어서 출력하기 : iterator() 메서드 사용
        Iterator<Integer> iterator = ts.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        // 순서없이 추가
        System.out.println("------------add()");
        ts.add(13);
        ts.add(12);
        ts.add(11);
        System.out.print(ts + " "); // 1 ........... 10 11 12 13
        
        // 제거
        System.out.println("------------remove()");
        // System.out.println(ts.remove(10));       // true
        // System.out.println(ts.remove(100));      // false
        ts.remove(10);
        System.out.print(ts + " ");

        // 여러 메서드 한꺼번에 사용
        System.out.println("-------------- 여러 메서드 사용");
        System.out.println(ts.contains(5)); // true
        System.out.println(ts.remove(5)); // true
        System.out.println(ts.isEmpty()); // false
        System.out.println(ts.size()); // 11
        System.out.println(ts.first()); // 1
        System.out.println(ts.last()); // 13
        System.out.println(ts); // [1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13]

        // floor, ceiling
        // - floor, ceiling 메서드는 지정한 요소의 값과 같은게 있으면 해당 요소를 출력
        // - higher, lower 메서드는 일단 지정한 요소의 값보다 크거나 작은거에서 값을 찾아서 출력
        System.out.println("---------------- floor(), ceiling()");
        System.out.println("ts.floor(5) : " + ts.floor(5)); // 4
        System.out.println("ts.ceiling(5) : " + ts.ceiling(5)); // 6
        System.out.println("ts.lower(5) : " + ts.lower(5)); // 4
        System.out.println("ts.higher(5) : " + ts.higher(5)); // 6

        System.out.println("-------------------------------");
        
        System.out.println("ts.floor(7) : " + ts.floor(7)); // 7
        System.out.println("ts.ceiling(7) : " + ts.ceiling(7)); // 7
        System.out.println("ts.lower(7) : " + ts.lower(7)); // 6
        System.out.println("ts.higher(7) : " + ts.higher(7)); // 8
    }    
}
