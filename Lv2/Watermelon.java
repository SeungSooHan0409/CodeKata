package codekata.Lv2;

public class Watermelon {

    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        // n 길이제한
        if(0 < n && n <= 10000) {

            // 문자열 생성
            for(int i = 1; i <= n; i++) {
                if(i%2 == 1) {
                    sb.append("수");
                } else {
                    sb.append("박");
                }
            }
        }

        answer = sb.toString();

        return answer;
    }

}
