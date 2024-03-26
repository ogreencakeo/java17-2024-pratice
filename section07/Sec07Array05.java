package Section07;

public class Sec07Array05 {
    public static void main(String[] args) {
        // 2차원 배열 + 반복문 이용해서 출력하기 + 총점/평균 구하기

        // 2차원 배열 데이터
        int stuScore[][] = {
            {70, 80, 60},
            {75, 85, 65, 90, 80},
            {80, 70, 90}
        };

        // 출력
        int stuTotalCnt = 0; // 학생들을 세는 변수
        int stuTotalScore = 0;

        System.out.println("스카이 아카데미 학생 성적표");
        System.out.println("================================");

        for(int i=0; i<stuScore.length; i++){
            int totalScore = 0;
            
            System.out.print(i + 1 +"번 학생 국/영/수 성적표 = ");
            for(int j=0; j<stuScore[i].length; j++){
                System.out.print(stuScore[i][j] + ", ");

                // 총점
                totalScore += stuScore[i][j];
                stuTotalScore += stuScore[i][j];

                // 총 학생수
                stuTotalCnt++;
            }
            System.out.print(i+1+"번 학생의 총점 : " + totalScore + ", 평균은 " + (double)totalScore/stuScore[i].length+"점");
            System.out.println();
        }

        System.out.printf("전체 학생의 총점 : %d점, 전체 학생의 평균 %.2f점\n", stuTotalScore, stuTotalScore / (double)stuTotalCnt);
        System.out.println("================================");
    }
}
