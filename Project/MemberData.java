package Project;

// 회원 한 명에 대한 객체 정보를 실제 저장하는 저장소 클래스
// - 쉽게 말해, 데이터베이스 역할
// - 처음 이러한 것들을 보고 할 때는 -> 순수배열을 이용해서 작업(Capacity Issue)
// - Array -> ArrayList ~> File DB ~> DB(Oracle, MYSQL, SQL Server...)

public class MemberData {
    static MemberDTO members[] = new MemberDTO[5];
}
