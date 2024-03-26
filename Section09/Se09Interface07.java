package Section09;

// 상속 관계에서 다형성 구현
// - 지금까지는 인터페이스로 다형성을 구현해봤는데, 이번에는 상속을 이용해서 다형성을 구현해보시오.
// - 아래 요구사항을 만들고, 동시에 매개변수 다형성을 이용하여 만들어 보시오.
//      1. Human 클래스 (Super)
//      2. Doctor, Nurse 클래스 (Sub)
//      3. GusetHouse 클래스

public class Se09Interface07 {
    public static void main(String[] args) {
        // Human h1 = new Human();
        // h1.printInfo();

        // 객체 생성 
        HDoctor kim = new HDoctor("김닥터", 40,"소아과");
        HDoctor lee = new HDoctor("이닥터", 40,"외과");
        HDoctor park = new HDoctor("박닥터", 40,"내과");

        HNurse you = new HNurse("유천사", 20, "산부인과");
        HNurse jang = new HNurse("장천사", 22, "내과");
        HNurse hong = new HNurse("홍천사", 23, "정형외과");

        // 출력
        kim.printInfo();
        you.printInfo();
        System.out.println();

        // 배열에 저장 ~> 타입이 맞지 않으면 저장이 X ~> 부모 타입의 배열을 만들어 저장하면 O
        // HDoctor doctor[] = {kim, lee, park};
        // HNurse nurse[] = {you, jang, hong};

        // 부모 타입의 배열 생성하여 저장
        Human humans[] = {kim, lee, park, you, jang, hong};

        for(Human h : humans) h.printInfo();

        // 각각의 객체를 show 메서드로 전달
        System.out.println("-------------------------------");
        GusetHouse gh = new GusetHouse();
        gh.show(lee);
        gh.show(hong);
    }
}

class Human{
    String name;
    int age;

    Human(){ this("무명", 0); }

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void printInfo(){
        System.out.printf(">> %s, %d \n", this.name, this.age);
    }
}

class HDoctor extends Human{
    String division;

    HDoctor(String name, int age, String division){
        super(name, age);
        this.division = division;
    }

    // 오버라이딩
    void printInfo(){
        System.out.printf(">> [의사] 이름 : %s, 나이 %d, 분과 : %s \n", this.name, this.age, this.division);
    }
}

class HNurse extends Human{
    String division;

    HNurse(String name, int age, String division){
        super(name, age);
        this.division = division;
    }

    // 오버라이딩
    void printInfo(){
        System.out.printf(">> [간호사] 이름 : %s, 나이 %d, 분과 : %s \n", this.name, this.age, this.division);
    }
}

class GusetHouse {
    // // [1]
    // public void show(HDoctor doctor){ doctor.printInfo(); }
    // public void show(HNurse nurse){ nurse.printInfo();}

    //[2]
    public void show(Human human){ 
        // [3] 특정 타입이 전달이 된 경우에만 출력이 되게끔 수정
        // 부모 타입으로 받으면 상속관계에 있는 서브 클래스 객체들을 모두 받을 수 있기 때문에,
        // instanceof 연산자를 사용하여 구분함
        if(human instanceof HNurse) System.out.println(">> 간호사님! 반갑습니다.");
        human.printInfo(); 
    }
}