package codekata;

public class CompareNumbers {
    public int solution(int num1, int num2) {
        int result;
        if(num1 >=0 && num1 <= 10000 && num2 >=0 && num2 <= 10000) {
            if(num1 == num2) {
                result = 1;
            } else {
                result = -1;
            }
        } else{
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }
        return result;
    }

    public void printSolution(int num1, int num2) {
        System.out.println(solution(num1, num2));
    }
}
