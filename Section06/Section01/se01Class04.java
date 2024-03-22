package Section06.Section01;

public class se01Class04 {
    public static void main(String[] args) {
        // 클래스와 객체 -> 메서드
        // 매개변수(Parameter) vs 인수(Argument)
        // - 항상 그렇듯 단어가 가지고 있는 뜻과 의미를 되새겨보면 헷갈리지 않음 -> 매개, 매개체
        // - 함수(메서드) 내부로 어떤 값을 전달하고자 할 때 사용하는 변수 -> 매개변수(로컬변수, 지역변수)
        // - 함수를 호출 할 때 어떤 값을 넣어서 호출할 수 있는데 -> 인수, 인자값(전달값)

        // - 클래스 작성시 해당 인스턴스의 "상태(속성)정보"와 "동작정보"를 정의하는데 메서드는 동작을 정의
        // - 메서드는 기본적으로 아래의 형태로 클래스안에 기술
        //      예) <수식자> <반환값타입> <메서드명> (인수1, 안수2, ...)
        //      예) public void printInfo(){ ... }
        // - 접근제한자는 생략이 가능 -> 생략하면 default 접근제한자 적용 -> 같은 패키지내에서는 사용 가능

        // - 메서드는 호출 할 때 값을 여러개 넣어서 호출 할 수 있는데 -> 이를 "인수" 또는 "인자"
        // - 메서드느 호출한 쪽으로 메서드 수행의 결과값을 되돌려 줄 수 있음 -> 반환값
        // - 호출한 쪽에서는 반환값을 받아서 다음 작업을 진행시켜 나갈 수 있음
        // - 반환값이 없는 경우 반환값 타입은 -> void
        // - 따라서, void 이외의 타입을 메서드 만들 때 지정했다면 -> return문을 사용해서 타입이 일치하는 값을 반드시 반환

        // - 메서드 종류
        //      인수가 없는 메서드 vs 인수가 있는 메서드
        //      반환값이 없는 메서드 vs 반환값이 있는 메서드

        // 객체 생성
        Person p1 = new Person("Superman", 20, 75.5);
        p1.printInfo();             // 20살
        p1.setAge(40);              // 인수를 넣어서 메서드 호출
        p1.printInfo();             // 40살

        int rst = p1.getAge();      // 인수를 넣는 것 없이 메서드만 호출
        System.out.println(rst);    // 40 
        
    }
}

class Person{
    // Field
    String name;
    int age;
    double weight;

    // Constructor
    Person(){}
    Person(String a, int b, double c){
        this.name = a;
        this.age = b;
        this.weight = c;
    }

    // Method - 반환값이 없는 메서드
    // - 전달하는 값을 받을 때 임의의 이름으로 변수를 정할 수 있는데 이를 -> 매개변수(로컬변수, 지역변수)
    // - 따라서, 타입을 메서드내에서 또 기술하면 -> Error
    // - 지역변수(local variable) -> 해당 메서드 안에서만 유효한 변수
    void setAge(int x){
        // int x = 100; // error
        this.age = x;
    }

    // Method - 반환값이 있는 메서드
    int getAge(){
        return this.age;
    }

    // 출력 - 반환값이 없는 메서드
    void printInfo(){
        System.out.println(this.name + "회원님의 나이는 " + this.age + "살 입니다.");
    }
}
