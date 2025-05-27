package codekata.Lv1;

public class HarshadNumber {

    public boolean solution(int x) {
        boolean answer = true;
        int SumOfDigits = 0;
        int x2 = x;
        if(0 < x && x <= 10000) {
            // 자릿수의 합을 구하는 메서드 구현
            for(int i = 1; (x2)%10 != 0 || (x2)/10 != 0; i++) {
                SumOfDigits += (x2)%10;
                (x2)/=10;
            }
            // 나머지가 생기면 false 를 반환.
            answer = (x%SumOfDigits == 0);
        } else {
            throw new IllegalArgumentException("올바른 입력값이 아닙니다.");
        }

        return answer;
    }

}
