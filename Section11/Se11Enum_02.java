package Section11;

enum Hero{ Superman, Batman, Antman, Wonderwomen, Ironman }
enum Hero2{
    // 각각의 히어로마다 파워값을 다르게 갖는 경우
    Superman(500), Batman(400), Antman(120), Wonderwomen(300), Ironman(250);

    // Field
    private int power;

    // Constructor
    Hero2(int power){
        this.power = power;
    }
    
    // Getter
    public int getPower(){
        return this.power;
    }
}

public class Se11Enum_02 {
    public static void main(String[] args) {
        // Enum 클래스 메서드 사용 - java.lang.Enum (모든 열거형의 조상 클래스로써 다양한 메서드를 제공)
        // - values(), valueOf(), ordinal(), 

        // [1]
        // values() : 열거형 내부에 정의된 모든 상수를 배열로 만들어서 반환 ~> 향상된 for 반복문 사용해서 출력
        System.out.println("------------------------ values()");
        Hero arr[] = Hero.values(); // 배열로 만듦.
        for(Hero h : arr){
            System.out.println(h);
        }
        
        // [2] 
        // valueOf() : 전달된 문자열에 해당되는 상수 반환
        System.out.println("------------------------ valueOf()");
        Hero hero = Hero.valueOf("Wonderwomen");
        System.out.println(hero); // Wonderwomen

        // [3]
        // ordinal() : 단어 뜻이 "순서를 나타내는..." 뜻이므로 열거체에 정의된 상수 순서(0부터 시작)를 반환
        System.out.println("------------------------ ordinal()");
        System.out.println(Hero.Ironman.ordinal()); // 4

        int AntmanIdx = Hero.Antman.ordinal();
        System.out.println(AntmanIdx); // 2

        // [4]
        // 정의된 상수가 일정하지 않은 값을 가지는 경우는???
        // 각각의 히어로가 파워값을 가지는데 Superman => 500, Wonderwomen => 300 ... 이런거를 정의하고 출력하려면?
        System.out.println("------------------------ 파워 출력()");
        System.out.println(">> Superman Power => " + Hero2.Superman.getPower()); // 500

        // 향상된 for문 반복문 사용하여 출력
        System.out.println("------------------------ 파워 출력() : for문");
        Hero2 hero2[] = Hero2.values();
        for(Hero2 h : hero2){
            System.out.println(">> " + h + " => " + h.getPower());
        }
    }
}
