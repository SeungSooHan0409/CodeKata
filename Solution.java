package codekata;

import org.w3c.dom.ls.LSOutput;

class Solution {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if(-10000000 <= x && x <= 10000000 && 0 < n && n <= 1000) {
            for (int i = 0 ; i < n ; i++) {
                answer[i] = (long)(i+1)*x;
            }
        }
        return answer;
    }

}


