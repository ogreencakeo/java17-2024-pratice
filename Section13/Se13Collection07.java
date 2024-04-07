package Section13;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Collections;

public class Se13Collection07 {
    public static void main(String[] args) {
        ArrayList<EPersonSec07> list = new ArrayList<>();

        EPersonSec07 e1 = new EPersonSec07("Superman", 20);
        EPersonSec07 e2 = new EPersonSec07("Batman", 30);
        EPersonSec07 e3 = new EPersonSec07("Antman", 24);
        EPersonSec07 e4 = new EPersonSec07("antman", 30);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        // 이름을 기준으로 정렬
        Collections.sort(list); // 오름차순
        
        // System.out.println(list);

        // 정렬된 리스트 출력
        for (EPersonSec07 p : list) {
            System.out.println(p);
        }
    }
}

class EPersonSec07 implements Comparable<EPersonSec07> {
    private String name;
    private int age;

    public EPersonSec07(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(EPersonSec07 other) {
        // [2] 정렬기준 : 이름
        // this 값은?
        char c1 = this.name.charAt(0);
        System.out.println((int)c1); // Superman Batman 중 Batman : 66
        
        // 66 - 65 : 1 (int값 반환)
        System.out.println(this.name.compareTo(other.name)); // 1이 출력

        // 같은 문자열끼리 빼기를 하면 0이 나온다.
        // System.out.println(this.name.compareTo(other.name)); 
        
        // return this.name.compareTo(other.name); // 오름차순
        return (this.name.compareTo(other.name)) * (-1); // 내림차순
    }

    @Override
    public String toString() {
        return String.format("Person {name : %s, age : %d}", name, age);
    }
}
