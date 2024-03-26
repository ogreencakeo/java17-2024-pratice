package Section09;
// 인터페이스와 다형성
// - 상속 관계에 있을 때 자식 클래스의 객체는 부모 클래스의 타입으로 받을 수 있다.
// - 이것은 추상 클래스와 인터페이스에서도 마찬가지로 적용 ~> 추후 이어지는 제너릭 문법에서도 주요하게 사용
// - 자동 형변환 ~> 인터페이스 경우 해당 구현체(객체)가 자동적으로 인터페이스 타입으로도 사용이 가능
// - 이러한 자동 형변환과 부모 타입으로 자식을 담을 수 있는 문법적 장치를 통해서 다형성을 구현
//      인터페이스타입 변수명 = 구현객체(자식클래스로 생성된)

public class Se09Interface03 {
    public static void main(String[] args) {
        // 객체 생성
        // Knife knife = new Knife();
        Weapon knife = new Knife(); // 가능함
        // Gun gun = new Gun();
        Weapon gun = new Gun(); // 가능함
        Weapon spear = new Spear(); 

        // 객체의 클래스 이름 출력
        System.out.println(knife.getClass().getName()); // section09.Knife
        System.out.println(gun.getClass().getName()); // section09.Gun
    
        // 인스턴스 타입 체크 -> 객체명 instaceof 클래스명
        System.out.println(knife instanceof Knife); // true
        System.out.println(gun instanceof Gun); // true
        System.out.println(knife instanceof Weapon); // false? 실제로는 true 출력

    }
}

// 무기
interface Weapon{
    void attack();
}

// 나이프
class Knife implements Weapon{
    public void attack(){ System.out.println(">> 휙휙~"); }
}

// 총
class Gun implements Weapon{
    public void attack(){ System.out.println(">> 탕탕~"); }
}

// 창
class Spear implements Weapon{
    public void attack(){ System.out.println(">> 창창~"); }
}
