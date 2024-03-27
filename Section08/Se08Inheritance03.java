package Section08;

// 클래스간의 관계 : Has-a 포함관계
// - 먼저 클래스와 클래스간의 관계를 맺을 때는 여러 문법적 장치가 있다.
// - 상속관계를 통해서 클래스간 관계를 맺을 수 있으며, 포함 관계를 통해서 클래스간 관계를 맺을 수도 있다.

// Has-a 관계
// - "가지고 있다"라는 일종의 포함 관계를 의미
// - 클래스를 만들 때 다른 클래스의 자원을 멤버변수로 포함하여 만들고 싶을 때 사용 ~> 타입으로 저장
// - 쉽게 말해, 다른 클래스를 "멤버변수(Field)로 가진다"라고 생각
// - 더 쉽게 말해서, 업무를 나눈다 생각 ~> 이 일은 너가 해서 나한테 줘... 그러면, 내가 다 햅해서 최종 제출할게
// - 데이터베이스 구축시에도 하나의 테이블에 다 몰아넣지 않고 ~> 테이블을 분산해서 저장 (테이블간의 관계를 적절히 구성)

public class Se08Inheritance03 {
    public static void main(String[] args) {
        // 객체 생성
        // UStudent 객체 생성을 먼저 하고, 그 다음에 UPerson 객체를 생성
        UStudent student1 = new UStudent("제주대", 3);
        UPerson person1 = new UPerson("홍길동", 23, student1);
        
        System.out.println("이름 : " + person1.name);
        System.out.println("나이 : " + person1.age);
        // private로 되어있기 때문에 get으로 호출해야 함
        System.out.println("학교 : " + person1.getStudent().university);
        System.out.println("학년 : " + person1.getStudent().grade);
        System.out.println(person1); // [ 이름 : 홍길동, 나이 : 23, 학교 : 제주대, 학년 : 3]
        
    }
}

class UPerson{
    // Field
    public String name;
    public int age;
    private UStudent student;

    // Constructor
    UPerson(String name, int age, UStudent student){
        this.name = name;
        this.age = age;
        this.student = student;
    }

    // Method - Getter, Setter
    public void Setter(UStudent s){
        this.student = s;
    }

    public UStudent getStudent(){
        return student;
    }

    @Override
    public String toString(){
        return "[ 이름 : " + this.name + ", 나이 : " + this.age + 
            ", 학교 : " + this.getStudent().university + ", 학년 : " + this.getStudent().grade + " ]";
    }
}

class UStudent{
    // Field
    public String university;
    public int grade;

    // Constructor
    UStudent(String university, int grade){
        this.university = university;
        this.grade = grade;
    }
}