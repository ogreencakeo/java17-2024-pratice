package Section08;

public class Se08Inheritance04 {
    public static void main(String[] args) {
        // 클래스간의 관계 : Has-a 관계를 이용한 클래스 만들기 - 배열편

    }
}

class TPerson{
    // Field
    public int id;       // 번호
    public String name;  // 이름
    public int nums;     // 시험 과목 수
    Score score[];       // 스코어 배열 => Score 타입의 객체들을 저장하는 배열

    //Constructor
    TPerson(int id, String name, int nums){
        this.id = id;
        this.name = name;
        this.nums = nums;
        this.score = new Score[nums];

        // 시험 과목 수 만큼 반복하면서 Score 객체 생성
        for(int i=0; i<nums; i++){
            score[i] = new Score();
        }
    }

    // Method

}

class Score{
    // Field
    private String subject;   // 과목 이름
    private int jumsu;        // 시험점수

    //Constructor

    // Method - Setter, getter
    public void setScore(String subject, int jumsu){
        this.subject = subject;
        this.jumsu = jumsu;

    }

    public String getScore(){
        return "[ " + subject + " => " + jumsu + "점 ]";
    }

    // Method
}