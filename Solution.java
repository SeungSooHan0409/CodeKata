package codekata;


import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public long solution(int n) {
        long answer = 0;
        int i = 0;
        long ternary = 0;

        // 제한사항
        if(1<= n && n <= 100000000) {

            // 반복문으로 3진수 구하기
            while(true) {
                ternary += (n%3)*(long)Math.pow(10,i);

                n/=3;

                if(n == 0) {
                    break;
                }

                i++;

            }

            // 3진수를 역순으로 10진수로 변환하기
            for(; i>=0; i--) {
                answer += (ternary%10)*(long)Math.pow(3,i);
                ternary/=10;
            }

        }

        return answer;
    }

}


