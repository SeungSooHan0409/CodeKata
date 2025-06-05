package codekata;


import java.util.Arrays;

class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];

        // 제한 조건1 - 행의 길이제한
        if(arr1.length <= 500) {

            // 제한 조건2 - 열의 길이제한
            for(int i=0; i < arr1.length; i++) {
                if(arr1[i].length > 500) {
                    throw new IllegalArgumentException("행렬의 열의 길이초과!");
                }

            }

            // 중첩 for 문으로 덧셈 로직 작성
            for(int i = 0; i < arr1.length; i++) {
                answer[i] = new int[arr1[i].length];

                for(int j = 0; j < arr1[i].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

        }

        return answer;
    }

}


