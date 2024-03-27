package Section08;

public class Se08Inheritance04 {
    public static void main(String[] args) {
        // 클래스간의 관계 : Has-a 관계를 이용한 클래스 만들기 - 배열편

        // p1 객체 생성
        TPerson tperson1 = new TPerson(001, "김철수", 3);
        
        // p1 객체 과목이름, 점수 입력
        // 테스트
        System.out.println(tperson1.score[0].getScore()); //  null => 0점 ]

        tperson1.score[0].setScore("java", 80);
        tperson1.score[1].setScore("python", 90);
        tperson1.score[2].setScore("react", 100);

        // System.out.println(tperson1.score[0].getScore());
        // System.out.println(tperson1.score[1].getScore()); 
        // System.out.println(tperson1.score[2].getScore());

        tperson1.printInfo();

        // p2 객체 생성
        TPerson p2 = new TPerson(002, "김장미", 5);
        p2.score[0].setScore("c언어", 95);
        p2.score[1].setScore("c++", 85);
        p2.score[2].setScore("javascript", 100);
        p2.score[3].setScore("jsp", 75);
        p2.score[4].setScore("spring", 80);

        p2.printInfo();
        
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
    public void printInfo(){
        System.out.println("-------------------------------");
        System.out.printf(">> 이름 : %s, 아이디 %d \n", this.name, this.id);
        // 향상된 for문
        for(Score s : score){
            System.out.println(s.getScore());
        }
        // for문
        // for(int i=0; i<score.length; i++){
        //     System.out.println(score[i].getScore());
        // }
        System.out.println("-------------------------------");
    }

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