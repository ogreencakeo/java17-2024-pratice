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
    }    
}
