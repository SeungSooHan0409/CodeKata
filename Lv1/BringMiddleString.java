package codekata.Lv1;

public class BringMiddleString {

    public String solution(String s) {
        String answer = "";
        int index = (s.length()/2);

        // s 의 길이제한
        if(0 < s.length() && s.length() <= 100) {

            // 길이가 짝수, 홀수일 때를 나눠서 출력
            if(s.length() % 2 == 1) {
                answer = s.substring(index, index+1);
            } else {
                answer = s.substring(index-1, index+1);
            }

        } else {
            throw new IllegalArgumentException("올바른 입력값이 아닙니다.");
        }

        return answer;
    }

}
