package Section06.Section01;

public class se01Class03 {
    public static void main(String[] args) {
        // 클래스와 객체 -> this 키워드
        //  - 클래스는 틀, 설계도, 공장이므로 이를 통해서 수많은 객체(인스턴스)들을 만들어 낼 수 있음
        //  - 이렇게 생성된 객체들은 각자의 변수를 가지게 된다 -> 객체 변소 또는 인스턴스 변수
        //  - 각자의 변수 값을 가질 수 있는 것은 -> 생성자 함수를 통해서 초깃값을 전달하여 객체를 생성하기 때문
        //      예) new Person("Superman" , "supermain@gmail.com", 20);
        //  - 이때, 생성자 함수에서 전달받는 매개변수 이름과 인스턴스 이름이 같다면?
        //      ~> 헷갈릴 수 있고 초기화도 제대로 안될 수 있으므로 -> this 키워드를 사용해서 명확하게 구분
        //  - 아니면, 생성자 함수에서 매개변수명을 다르게 작성

        // this 키워드란?
        // 1. 현재 클래스를 이용하고 있는 객체(인스턴스) 그 자체를 의미
        // 2. 즉, 객체 생성시 만들어지고 있는 그 객체(인스턴스)를 가리킨다라고 보면 됨
        
        Student s1 = new Student("홍길동", 98);
        s1.printInfo();
    }
}


class Student{
    // Field
    String name;
    int score;

    // Constructor
    Student(){
        System.out.println("안녕");
    };
    Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    // Method
    public void printInfo(){
        System.out.printf("중간고사 %s 학생의 평균 성적은 %d점 입니다.\n", name, score);
    }
}