package codekata;

import org.w3c.dom.ls.LSOutput;

class Solution {

    public int solution(int num1, int num2) {
        int answer = 0;
        boolean rangeOfNumber = (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000);
        if(rangeOfNumber){
            answer = num1 + num2;
        } else {
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }
        return answer;
    }

        public void printSolution(int num1, int num2) {
            System.out.println(solution(num1, num2));
        }

}


