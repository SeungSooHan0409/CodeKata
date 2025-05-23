package codekata;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


class Solution {

    public long solution(int a, int b) {
        long answer = 0;
        // 숫자 범위 지정
        if(-10000000 <= a && a <= 10000000 && -10000000 <= b && b <= 10000000) {
            // b 가 a 보다 클 경우
            if (b > a) {
                for (int i = 0; b-i >= a; i++) {
                    answer += b-i;
                }
            }
            // a 가 b 보다 클 경우
            else if(a > b) {
                for (int i = 0; a-i >= b; i++) {
                    answer += a-i;
                }
            }
            // a = b 인 경우
            else {
                answer = a;
            }
        }
        // 숫자 범위를 벗어난 경우
        else {
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }

        return answer;
    }

}


