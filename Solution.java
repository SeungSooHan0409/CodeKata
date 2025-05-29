package codekata;


class Solution {

    public int solution(int[] a, int[] b) {
        int answer = 0;

        // 배열 길이 제한
        if(0 <= a.length && a.length <= 1000) {

            // 내적 로직
            for(int i = 0; i < a.length; i++) {
                answer += a[i]*b[i];
            }

        }

        return answer;
    }

}


