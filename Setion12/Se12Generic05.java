package Setion12;

public class Se12Generic05 {
    public static void main(String[] args) {
        // 제네릭 클래스의 매개변수 타입 제한하기
        // - 매개변수의 타입을 제한 할 수 있는데 이때는, 상속 관계를 이용해서 구현한다.
        // - 쉽게 말해, Number 클래스를 상속받은 것으로만 제한을 해줬다면 ~> Integer, Double은 가능하나, String은 오류 발생
        // - 객체를 생성할 때, 다이아몬드 연산자 안에 String을 쓰는 순간 오류 발생 .... !
        Data12_05<Integer> dataInt = new Data12_05<>();
        dataInt.setFoo(100);
        System.out.println(dataInt.getFoo()); // 100
        System.out.println(dataInt); // java.lang.Integer
        System.out.println();

        Data12_05<Double> dataInt2 = new Data12_05<>();
        dataInt2.setFoo(10.052);
        System.out.println(dataInt2.getFoo()); // 10.052
        System.out.println(dataInt2); // 타입 정보 출력 : java.lang.Double
    }
}

class Data12_05<T extends Number>{
    // Field
    private T foo;

    // setter
    public void setFoo(T t){
        foo = t;
    }

    // Getter
    public T getFoo(){
        return foo;
    }

    // toString
    public String toString(){
        return "타입 정보 출력 : " + foo.getClass().getName();
    }
}