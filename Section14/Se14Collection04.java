package Section14;

public class Se14Collection04 {
    public static void main(String[] args) {
        // equals 메서드 재정의 조금 더 상세히보기 ~> 컬렉션 사용할 때

        // OPerson 객체 생성
        OPerson p1 = new OPerson("Wonderwomen");
        OPerson p2 = new OPerson("Wonderwomen");

        System.out.println("p1 == p2 결과는 ? : " + (p1 == p2));
        System.out.println("p1.equals(p2) 결과는 ? : " + p1.equals(p2));
        System.out.println();

    }
}

class OPerson{
    String name;

    OPerson(String name){ this.name = name; }

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