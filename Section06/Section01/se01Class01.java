package Section06.Section01;

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

    public void test(){
        System.out.println("Hello ~!");
    }
    
    public void test(String str){
        System.out.println("Hello, " + str + "~!");
    }
}
