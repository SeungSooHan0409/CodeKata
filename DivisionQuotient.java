package codekata;

public class DivisionQuotient {

    // 나눗셈 로직
    public int solution(int num1, int num2) {
        int answer;
        if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100){
            answer = (num1 / num2);
        } else {
            throw new IllegalArgumentException("숫자 범위를 확인해주세요.");
        }
        return answer;
    }


    // solution 출력메서드
    void printSolution() {
        System.out.println(solution(9,4));
    }

}
