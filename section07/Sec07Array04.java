package section07;

public class Sec07Array04 {
    public static void main(String[] args) {
        // 다차원 배열
        // - 차원에 대한 개념이 있어야 한다.
        // - "차원" 이라는 용어에 집중하기 보다는 일상 생활속 데이터를 보면서
        //    다차원 배열로 구성하면 되겠구나... 라고 생각하는게 중요
        // - 한 학생의 성적을 담는 배열은 몇 차원? -> 1차원 배열 

        // [1] 1차원 배열
        int stuScore[] = {55, 90, 70};
        System.out.printf("한 한색의 국/영/수 점수는 = %d, %d, %d", stuScore[0], stuScore[1], stuScore[2]);

        System.out.println();

        // [2] 2차원 배열
        // 일단 2차원 배열의 데이터 모습을 상상하면서 머릿속에 그리자
        int stuScore2[][] = {
            {55, 90, 80},
            {75, 40, 50},
            {50, 50, 90}
        };

        // 출력
        for(int i=0; i<stuScore2.length; i++){
            // for(int j=0; j<stuScore2[i].length; j++){
                System.out.printf("%d번의 국/영/수 성적표 = %d, %d, %d \n", i+1, stuScore2[i][0], stuScore2[i][1], stuScore2[i][2]);
            // }
        }
    }
}
