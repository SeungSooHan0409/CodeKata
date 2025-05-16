package codekata;

public class Division {
    class Solution {
        public int solution(double num1, double num2) {
            double resultOfCalculation = 0;
            if(0<num1 && num1<=100 && 0<num2 && num2<=100){
                resultOfCalculation = (num1/num2)*1000;
            }
            int answer = (int) resultOfCalculation;
            return answer;
        }
    }
}
