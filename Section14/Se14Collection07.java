package Section14;

import java.util.TreeSet;

public class Se14Collection07 {
    public static void main(String[] args) {
        // TreeSet 컬렉션에서 pollFirst(), pollLast() 메서드 사용하기

        // 데이터 생성
        int data[] = {4, 5, 6, 7, 8, 10, 4, 6, 2, 3, 8, 1, 7, 5, 2, 9};
        
        // TreeSet 객체 생성
        TreeSet<Integer> ts = new TreeSet<>();

        // TreeSet 컬렉션에 저장하기
        for(int i=0; i<data.length; i++){
            ts.add(data[i]);
        }

        System.out.println("---------------------------------------- TreeSet<Integer>");
        System.out.println("ts 전체 출력 => " + ts);    //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        int a = ts.pollFirst();
        int b = ts.pollLast();

        System.out.println(a);                  // 1
        System.out.println(b);                  // 10
        System.out.println(ts);                 // [2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(ts.pollFirst());     // 2
        System.out.println(ts.pollLast());      // 9
        System.out.println(ts);                 // [3, 4, 5, 6, 7, 8]

        ts.clear();
        System.out.println(ts);                 // []
        System.out.println(ts.pollFirst());     // null
        System.out.println(ts.pollLast());      // null

        System.out.println("---------------------------------------- TreeSet<String>");
        String data2[] = {"A", "B", "C", "D", "E", "F"};

        TreeSet<String> ts2 = new TreeSet<>();
        for(int i=0; i<data2.length; i++){
            ts2.add(data2[i]);
        }

        System.out.println("ts2 전체 출력 => " + ts2);      //  [A, B, C, D, E, F]
        
        String s1 = ts2.pollFirst(); 
        String s2 = ts2.pollLast(); 
        
        System.out.println(s1);   // A
        System.out.println(s2);   // F
        System.out.println("ts2 전체 출력 => " + ts2);      //  [B, C, D, E]

        System.out.println(ts2.pollFirst()); // B
        System.out.println(ts2.pollLast());  // E
        System.out.println("ts2 전체 출력 => " + ts2); // [C, D]

        ts2.clear();
        System.out.println(ts2.pollFirst()); // null
        System.out.println(ts2.pollLast()); // null
    }
}
