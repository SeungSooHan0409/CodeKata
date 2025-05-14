package codekata;

import org.w3c.dom.ls.LSOutput;

class Solution {

    public double solution(int[] numbers) {
        double answer = 0;
        double stackOfNum = 0;
        for(int i = 0; i < numbers.length; i++){
            if(0 <= numbers[i] && numbers[i] <= 1000 && 1 <= numbers.length && numbers.length <= 100) {
                stackOfNum += numbers[i];
            }
        }
        answer = stackOfNum/numbers.length;
        return answer;

    }
}


