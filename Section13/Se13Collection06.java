package Section13;

import java.util.ArrayList;
import java.util.Collections;

// 사용자 정의 객체 정렬에 대해서
// - 사용자 정의 객체를 그냥 정렬하려고 하면 오류가 발생 => WHY? => Comparable<T> 인터페이스 구현 필요
// - 래퍼 클래스인 경우 이러한 것들이 구현되어 있기에 그냥 sort() 메서드를 호출하면 정렬이 가능

// 구현은 어떻게
// - Collections.sort() 메서드는 정렬할 컬렉션의 요소들이 Comparable 인터페이스를 구현하고 있는지 확인
// - Comparable 인터페이스는 compareTo() 메서드를 반드시 구현
// - 이 메서드는 두 개의 객체를 비교하여 한 객체가 다른 객체보다 크면 양수(1), 같으면 (0), 작으면 음수(-1)를 반환
// - EPerson 클래스는 Comparable 인터페이스를 구현하지 않았기 때문에 오류가 발생한 것
// - 따라서, sort() 메서드로 정렬을 수행하려면 EPerosn 클래스에 Comparable 인터페이스 구현이 필요
// - 빼기 순서가 헷갈리면 일단 빼보고 실행 결과를 보면 됨 ~> 내가 원하는게 아니면 반대로 작성

// 오류가 계속 나는 이유는?
// - Comparable 인터페이스가 제네릭 기반이기 때문에 타입 지정이 필요 ~> interface Comparable<T>
// - compareTo() 메서드는 음수를 반환하면 sort 메서드가 두 객체를 체인지
// - 음수를 반환했다는 것은 첫 번째 객체(this)가 두 번째 객체 보다 작음을 의미

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
        System.out.println();

        // 정렬하기
        // default가 오름차순
        // Collections.sort(list);
        // 내림차순 (Descending)
        Collections.sort(list, Collections.reverseOrder());
    
        // 나이 순으로 정렬해서 다시 출력
        for(EPerson person : list){
            System.out.println(person); 
        }
    }
}

class EPerson implements Comparable<EPerson>{
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

    @Override
    public int compareTo(EPerson other) {
        // 나이 기준 : 자기자신(this.age)하고 들어온 객체(other.age)를 빼주면 됨
        //정렬 기준 : 나이
        return this.age - other.age; // 오름차순
        // return other.age - this.age; // 내림차순
    }
    // 구현은 어떻게...
    // - Collections.sort() 메서드는 정렬할 컬렉션의 요소들이 Comparable 인터페이스를 구현하고 있는지 확인
    // - Comparable 인터페이스는 compareTo() 메서드를 반드시 구현
    // - 이 메서드는 두 개의 객체를 비교하여 한 객체가 다른 객체보다 크면 양수(1), 같으면 0, 작으면 음수(-1)를 반환
    
    // 오류가 계속 나는 이유는?
    // - Comparable 인터페이스가 제네릭 기반이기 때문에 타입 지정이 필요 ~> interface Comparable<T>
    // - compareTo() 메서드는 음수를 반환하면 sort 메서드가 두 객체를 체인지 this.age - other.age
    // - 음수를 반환했다는 것은 첫 번째 객체(this)가 두 번째 객체 보다 작음을 의미.
}
