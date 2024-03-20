package Section06.Section01;

// 클래스와 객체 -> 생성자 (Constructor)
// 생성자란 무엇인가?
//      - 1. 생성자도 함수(메서드)이다.
//      - 2. 객체가 만들어질 때 (new) 클래스내에서 제일 먼저 자동 호출되어 실행되는 함수
//      - 3. 그렇기에 new해서 객체를 생성할 때 ~> new Person(); 이런식으로 생성자 함수를 호출
//      - 4. 하지만, new 사용하지 않고 클래스명으로 클래스 자원을 호출해서 사용할 때는 Person.move(); 식으로 작성
//      - 5. 객체 생성시 ~> 객체의 초기화를 담당 (★★★)
//      - 6. 여러가지 형태의 객체를 생성할 수 있도록 -> 생성자 오버로딩이 얼마든지 가능
//      - 7. 생성자명은 클래스명과 같아야 한다.
//      - 8. 생성자는 반환값이 없는 함수(메서드)이다.


public class se01Class01 {
    public static void main(String[] args) {
        // 객체 생성 -> new
        // new AIPerson().test();
        AIPerson a1 = new AIPerson();
        a1.test(); // Hello, Test ~!
        
        AIPerson a2 = new AIPerson();
        a2.test("a2"); // Hello, Test ~!
    }
}

class AIPerson{
    // 필드(상태 정보)
    String name;
    int age;

    // 오버로딩
    // 같은 이름을 가진 메서드가 서로 다른 매개변수를 갖는 것
    public void test(){
        System.out.println("Hello ~!");
    }
    
    public void test(String str){
        System.out.println("Hello, " + str + "~!");
    }
}
