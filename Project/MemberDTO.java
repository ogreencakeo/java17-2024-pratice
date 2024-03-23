package Project;

// 클래스 사이에서 회원 정보를 주고 받을 때 사용하는 회원 객체 한 명에 대한 정보를 담는 클래스
// - 메서드와 메서드 사이에서 회원 정보를 주고 받을 때 사용
// - DTO(Data Transter Object)
// - DTO는 로직을 가지지 않는 순수한 데이터 객체
// - 이외에도 VO, DAO(DB 연동 관련) 등..


public class MemberDTO {
    // Field
    private int no;
    private String name;
    private String hp;
    public String eml;
    
    // Constructor
    MemberDTO(){}
    MemberDTO(int no, String name, String hp, String eml){
        this.no = no;
        this.name = name;
        this.hp = hp;
        this.eml = eml;
    }

    // Setter Method
    
    // Getter Method 

    // toString Method
    // 1. 하는 역할 : 객체(인스턴스)에 대한 정보를 문자열로 반환
    // 2. 소속 : Object 클래스에 속해있는 메서드, 객체 정보를 "클래스명@16진수해시코드"로 출력
    // 3. 반환되는 기본 형태가 해당 클래스 이름과 해당 객체의 메모리 주소를 결합한 형태로 반환
    // 4. 어떻게 사용할 수 있지? : 모든 클래스의 조상격인 Object 클래스에 소속된 메서드이기 때문에 자동적으로 사용 가능
    // 5. Object 클래스는 java.lang 패키지에 포함된 클래스(자주 사용하는 클래스들을 모아 놓은 패키지)
    // 6. java.lang 패키지의 클래스들은 import 없이 자동 삽입
    // 7. 중요한 것은 기본 형태가 위와 같이 출력되므로 적절하게 오버라이딩하여 객체의 값을 출력하여 사용하는게 필요!
    // 8. 특이한 점 : System.out.println()로 객체명(참조변수명)만 써줘도 내부적으로 toString 메서드 자동 호출(생략 가능)
    // public void printInfo(){
    //     System.out.printf("MemberDTO[ no : %d, name : %s, hp : %s, eml : %s ] \n",
    //         no, name, hp, eml);
    // }
    @Override
    public String toString(){
        return "MemberDTO [ no = " + no + ", name = " + name + ", hp = " + hp + ", eml = " + eml + " ]";
    }
}
