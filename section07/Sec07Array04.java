package Section07;

public class Sec07Array04 {
    public static void main(String[] args) {
        // 다차원 배열
        // - 차원에 대한 개념이 있어야 한다.
        // - "차원" 이라는 용어에 집중하기 보다는 일상 생활속 데이터를 보면서
        //    다차원 배열로 구성하면 되겠구나... 라고 생각하는게 중요
        // - 한 학생의 성적을 담는 배열은 몇 차원? -> 1차원 배열 

        // [1] 1차원 배열
        int stuScore[] = {55, 90, 70};
        System.out.printf("한 한색의 국/영/수 점수는 = %d, %d, %d \n", stuScore[0], stuScore[1], stuScore[2]);

        // [2] 2차원 배열
        // 일단 2차원 배열의 데이터 모습을 상상하면서 머릿속에 그리자
        int stuScore2[][] = {
            {55, 90, 80},
            {75, 40, 50},
            {50, 50, 90, 50, 60, 40},
            {50, 50, 90},
        };

        // 출력 -> 이중 반복문 필요
        // 행을 반복하는 반복문 : 바깥쪽 for문
        // 열을 반복하는 반복문 : 안쪽 for문 -> 여기의 조건식을 작성하는 것이 핵심 포인트!
        for(int i=0; i<stuScore2.length; i++){
            System.out.print( i + 1 + "번 학생의 국/영/수 성적표 :");
            for(int j=0; j<stuScore2[i].length; j++){
                System.out.print(stuScore2[i][j]);
                if(j != stuScore2[i].length-1){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
