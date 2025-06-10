package codekata;


import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 제한 사항
        if(1 <= n && n <= 1000000 && 1 <= m && m <= 1000000) {

            // 최대 공약수 구하기
            int divisor = 0;

            for(int i = n; i >= 1; i--) {

                // i 가 n 의 약수일 경우 최대공약수 인지 검사
                if(n%i == 0 && m%i ==0) {
                    divisor = i;
                    break;
                }

            }


            // 최소공배수 구하기
            int multiple = n*m/divisor;


            // 최소공배수, 최대공약수를 입력
            answer[0] = divisor;
            answer[1] = multiple;

        } else {
            throw new IllegalArgumentException("지정된 숫자 범위가 아닙니다.");
        }

        return answer;
    }

}


