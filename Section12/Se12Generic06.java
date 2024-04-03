package Section12;

import java.util.ArrayList;
// 배열은 제네릭을 지원하지 않습니다. 
// 따라서 배열에 다양한 타입의 요소를 저장할 수 있지만, 요소의 타입이 명시적으로 선언되지 않습니다.
// ArrayList는 제네릭을 지원합니다.
// 따라서 ArrayList를 선언할 때 요소의 타입을 명시적으로 지정할 수 있습니다.

public class Se12Generic06 {
    public static void main(String[] args) {
        // 제네릭과 배열리스트(ArrayList) 함께 사용하기
        // - 가장 많이 사용되는 것 중 하나이므로 속달될 때까지 반복해서 연습
        // - 앞서 제네릭 관련 문법을 배웠으면, 이제 ArrayList 클래스도 기본은 볼 수 있게 되었다.
        // - 보다 자세한 ArrayList 학습 및 예제는 추후 컬렉션 파트에서 자세히 공부

        // - 조류 객체만 담는 클래스를 만들어보시오.
        //      1. Birds 클래스를 추상 클래스로 만들고, 추상 메서드로 cry() 메서드를 정의한다.
        //      2. Birds 클래스를 상속 받는 Eagle 자식 클래스를 만들고, Cry() 메서드를 구체적으로 구현한다. 
        //      3. Birds 클래스를 상속 받는 Owl 자식 클래스를 만들고, Cry() 메서드를 구체적으로 구현한다. 
        //      4. Dog 클래스를 만들고, Birds 클래스는 상속 받지 않는다.
        //      5. AnimalList 클래스를 제네릭으로 만들고, Eagle, Owl 객체를 ArrayList에 저장한다.
        
        // Birds 타입에 대해서만 저장하도록 선언
        AnimalList<Birds> animals1 = new AnimalList<>();

        // 추가하기
        animals1.setter(new Eagle());
        animals1.setter(new Owl());
        animals1.setter(new Eagle());
        animals1.setter(new Owl());
        // animals1.setter(new Dog()); // error // Birds 타입이 아닌 경우 오류 발생

        // 가져오기
        // for(AnimalList a : animals1){
        //     System.out.println(a);
        // }
        // 반복문으로 저장된 객체 모두 출력
        for(int i=0; i<animals1.getSize(); i++){
            System.out.print(animals1.getter(i) + " => ");
            animals1.getter(i).cry();;
        }

        // 사이즈 출력
        System.out.println("현재 배열리스트에 저장된 객체 수 : " + animals1.getSize());
    }
}

abstract class Birds{ abstract void cry(); }
class Eagle extends Birds{ void cry(){ System.out.println("이글이글~");} }
class Owl extends Birds{ void cry(){ System.out.println("부엉부엉~");} }
class Dog{ void cry(){ System.out.println("멍멍~");} }

class AnimalList<T>{
    // ArrayList 선언
    ArrayList<T> alist = new ArrayList<>();
    // Setter
    void setter(T obj){
        alist.add(obj);
    }

    // Getter
    T getter(int idx){
        return alist.get(idx);
    }

    // Size()
    int getSize(){
        return alist.size();
    }
}