package Section14;

import java.util.HashSet;

public class Se14Collection04 {
    public static void main(String[] args) {
        // equals 메서드 재정의 조금 더 상세히보기 ~> 컬렉션 사용할 때

        // // OPerson 객체 생성
        // OPerson p1 = new OPerson("Wonderwomen");
        // OPerson p2 = new OPerson("Wonderwomen");

        // System.out.println("p1 == p2 결과는 ? : " + (p1 == p2));
        // System.out.println("p1.equals(p2) 결과는 ? : " + p1.equals(p2));
        // System.out.println();

        // HashSet 객체 생성
        // [1]
        // HashSet<String> set = new HashSet<>();

        // String p1 = new String("Wonderwomen");
        // String p2 = new String("Wonderwomen");

        // // 요소 추가
        // set.add(p1);
        // set.add(p2);

        // // 전체 개수 구하기
        // System.out.println(set.size()); // String 클래스는 재정의 하므로 1이 나옴

        // [2]
        HashSet<OPerson> set = new HashSet<>();

        set.add(new OPerson("Superman"));
        set.add(new OPerson("Batman"));
        set.add(new OPerson("Antman"));

        System.out.println(set);
        System.out.println("현재 사이즈 : " + set.size()); // 3
        
        set.add(new OPerson("Superman"));
        System.out.println("----------------------------");
        System.out.println(set);
        System.out.println("현재 사이즈 : " + set.size()); // 3 // 재정의 전 : 4
    }
}

class OPerson{
    String name;

    OPerson(String name){ this.name = name; }

    @Override
    public String toString(){
        return "{ " + name + " }";
    }

    // name 필드를 기반으로 해시 코드를 생성하여 반환하고 있다. 
    // 이는 같은 이름을 갖는 OPerson 객체들은 같은 해시 코드를 갖게 된다.
    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof OPerson){
            OPerson o = (OPerson) obj;
            return name.equals(o.name);
        }else{
            return false;
        }
        // return this.name.equals(((OPerson)obj).name);
    }
}