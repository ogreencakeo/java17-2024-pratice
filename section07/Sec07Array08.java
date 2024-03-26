package Section07;

public class Sec07Array08 {
    public static void main(String[] args) {
        // 항상된 for문 
        // - 반복문 파트가 아닌 배열 파트에서 설명 ~> 배열과 컬렉셔에서 많이 사용하기 때문
        // - 말 그대로 기존의 for 반복문을 좀 더 편리하고, 손쉽게 사용할 수 있도록 만든 새로운 반복문 형태
        // - 배열과 컬렉션 프레임워크 객체 등에서 사용하면 편리 (여기에서 많이 사용)
        // - 1차원 배열은 어렵지 않으나, 2차원 배열은 처음에 생각보다 조금 헷갈리고 어려울 수 있음
        // - 기존 for문으로 2차원 배열을 잘 써도 향상된 for문을 잘 모르는 경우가 많음 -> 2차원 배열의 특징을 잘 이해하는게 중요

        // 기본 형태
        // for( 변수명 : 배열(컬렉션)명 ){ ... }
        // 1. 당연히 변수명 앞에 타입 명시 필요
        // 2. 사용된 변수는 기존 for문처럼 향상된 for문 안에서만 사용
        // 3. 배열의 길이만큼 배열 요소가 자동으로 변수에 매핑되어 들어와서 반복 출력 또는 특정 작업을 수행
        // 4. 원본 배열을 변경하지 않는다.

        // [1] 1차원 배열 - int
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        for(int x : arr1)
            System.out.print((x*=10) + ", ");

        System.out.println();
        // 1차원 배열 - string
        String[] animals = new String[]{"Lion", "Tiger", "Hipo", "Elephant"};
        for(String s: animals)
        System.out.print(s + ", ");
        
        System.out.println();
        // [2] 2차원 배열
        int[][] arr2 = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        
        // 기존 for문 사용
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + ", ");
            }
        }

        System.out.println();

        // 향상된 for문 사용 -> 처음에 조금 헷갈리고 어려울 수 있음
        for(int[] x : arr2){
            for(int j :x){
                System.out.print(j + ", ");
            }
        }
    }
}
