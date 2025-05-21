package codekata;

import org.w3c.dom.ls.LSOutput;

class Solution {

    public int[] solution(long n) {
        long copyOfN = n;
        if(0 < n && n <= 10000000000L) {
            int i = 0;
            for(i = 0; n != 0; i++) {
                n /= 10;
            }
            int[] answer = new int[i];
            for(i = 0; copyOfN != 0; i++) {
                answer[i] = (int)(copyOfN%10);
                copyOfN /= 10;
            }
            return answer;
        } else {
            throw new IllegalArgumentException("올바른 값을 입력해주세요.");
        }
    }

}


