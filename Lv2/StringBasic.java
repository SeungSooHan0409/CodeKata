package codekata.Lv2;

public class StringBasic {

    public boolean solution(String s) {
        boolean answer = true;

        // 제한사항
        if(1 <= s.length() && s.length() <= 8) {

            // 길이가 4 또는 6 일 경우만 계산
            if(!(s.length() == 4) && !(s.length() == 6)) {
                answer = false;
            }

            // 예외발생 여부로 answer 값 설정
            try {
                Integer examination = Integer.valueOf(s);
            } catch(NumberFormatException e) {
                answer = false;
            }

        }

        return answer;
    }

}
