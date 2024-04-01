package Section11;
// Enum 열거형 (처음 사용자는 조금 어렵게 느낄 수 있는 문법 )
// ★ 열거형이란 ?
// - 쉽게 말해, 상수를 다루기 편하게 하려고 나온 문법
// - 열거형을 사용하면 정의해놓은 상수 이외의 것들은 사용할 수 없으므로 안전성 보장

// ★ 일상에서 볼 수 있나?
// - 사이트 회원가입시 취미 입력 폼(Select Form), 구글 스프레드시트 선택 폼 사용시에도 이러한 개념을 아주 많이 사용
// - 일상에서 볼 수 있는 이런 것들을 자바 문법으로 반영했다고 생각하면 됨

// ★ enumerate : 열거하다
// - 단어 뜻 그대로 뭔가 열거한다라는 의미로 생각 ~> 뭔가? ~> 상수
// - 자바에서 일반적으로 상수를 정의 할 때 사용하는 키워드 ~> final, static 등이 있는데 이를 보다 편리하게 사용
// - 즉, "관련성 있는 것들끼리 묶어놓은 상수들의 집합체"라고 보면 됨
// - enum을 하나의 타입처럼 사용할 수 있음 (중요)

// ★ 장점
// - 정의해놓은 상수를 그대로 기술할 수 있기 때문에 코드가 간결해지고 명확해져서 가독성이 향상
// - 정의한 상수 외 다른 타입의 값을 지정할 수 없음.

// ★ 사용
// - 열거형이름(타입) 변수 = 열거형이름.상수;
//          String day = "SUN";
//          Days day = Days.SUN;

public class Se11IO_08 {
    // 기존 방식 : 열거형을 사용하지 않는 방식
    public static final String SUN = "일요일(Sunday)";
    public static final String Sat = "토요일(Saturday)";

    public static void main(String[] args) {
        // [1] 기존 방식
        String sDay;
        sDay = Se11IO_08.SUN;
        System.out.println(sDay); //일요일(Sunday)
        
        sDay = "안녕하세요";
        System.out.println(sDay); // 컴파일 단계에서 오류가 나지 않음 ~> String 타입이니깐 너무 당연함
        
        // [2] 열거형 사용
        System.out.println("-------- 열거형 사용 ---------");
        EnumDay eDay;
        eDay = EnumDay.SUN;
        System.out.println(eDay); // SUN
        // eDay = "안녕하세요"; // error => 컴파일 단계에서 오류를 감지
    
        // [3] "토요일(Saturday)" 이렇게 한글로 출력하려면?
        System.out.println("--------한글로 출력 ---------");
        System.out.println(EnumDay.SUN.hangul);
    }
}

enum EnumDay{
    SUN("일요일 (Sunday)"), 
    SAT("토요일 (Saturday)");

    // Field
    public String hangul;

    // Constructor
    EnumDay(String str){
        this.hangul = str;
    }

    // Method
}