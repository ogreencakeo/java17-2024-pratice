package Section12;

public class Se12Generic04 {
    public static void main(String[] args) {
        // 매개변수를 여러개 받는 제너릭 클래스 정의하기
        // - 매개변수로 String(사람이름), Integer(사람 나이) 2개를 받는 제네릭 클래스를 정의해보시오.
        DataTwo<String, Integer> dtwo = new DataTwo<>();
        dtwo.set("Superman", 25); // 순서를 바꾸면 에러 발생
        // T1 타입 정보 출력 => java.lang.String
        // T2 타입 정보 출력 => java.lang.Integer
        dtwo.printInfo();
        System.out.println(dtwo);

        System.out.println();

        DataTwo<Double, String> dtwo2 = new DataTwo<>();
        dtwo2.set(75.5, "Batman");
        dtwo2.printInfo();
        System.out.println(dtwo2);
    }
}

class DataTwo<T1, T2>{
    // Field
    private T1 foo;
    private T2 bar;

    // Setter
    public void set(T1 t1, T2 t2){
        this.foo = t1;
        this.bar = t2;
    }

    // printInfo
    public void printInfo(){
        System.out.println("T1 타입 정보 출력 => " + foo.getClass().getName());
        System.out.println("T2 타입 정보 출력 => " + bar.getClass().getName());
    }

    // toString()
    public String toString(){
        return foo + ", " + bar;
    }
}
