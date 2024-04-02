package Setion12;

public class Se12Generic03 {
    public static void main(String[] args) {
        // 제네릭 (Generic) 실습
        // 사용
        DataSec1203<Integer> d1 = new DataSec1203<Integer>(100);
        System.out.println(d1.getObj()); // 값 출력
        d1.PrintInfo(); // java.lang.Integer

        DataSec1203<String> d2 = new DataSec1203<>("대한민국");
        System.out.println(d2.getObj()); // 대한민국
        d2.PrintInfo(); // java.lang.String
    }
}

class DataSec1203<T>{
    T obj;

    DataSec1203(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return this.obj;
    }

    void PrintInfo() {
        System.out.println(">> 타입 출력 : " + obj.getClass().getName());
    }
}
