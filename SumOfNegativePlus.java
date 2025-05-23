package codekata;

public class SumOfNegativePlus {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        // 배열의 크기 제한
        if(0 < absolutes.length && absolutes.length <= 1000) {
            // element 의 크기 제한
            for(int i : absolutes) {
                if(0 >= i || i > 1000) {
                    throw new IllegalArgumentException("올바른 element 값이 아닙니다.");
                }
            }

            answer = 0;

            // 실제합 구하기
            for(int i = 0; i < absolutes.length; i++) {
                if(signs[i] == false) {
                    answer -= absolutes[i];
                } else {
                    answer += absolutes[i];
                }
            }
        }
        return answer;
    }

}
