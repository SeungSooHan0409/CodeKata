package codekata;

import org.w3c.dom.ls.LSOutput;

class Solution {

    public int solution(int n) {
        int answer = 0;
        // 약수 : 나머지가 없어야함.
        if(0 <= n && n <= 3000) {
            for (int i=1 ; i <= n ; i++) {
                if(n%i == 0) {
                    answer += (n/i);
                }
            }
        }
        return answer;
    }

}


