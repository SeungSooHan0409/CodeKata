package codekata.Lv3;

public class StrangeString {

    public String solution(String s) {
        String answer = "";
        int count = 0;

        // 문자열을 문자배열로 변환
        char[] charArr = s.toCharArray();

        // 단어의 짝수번째 인덱스에는 대문자로 변경
        for(int i = 0; i < s.length(); i++) {

            // 대문자 자리에 소문자 오면 로직전환 (if, else if)
            if(i%2 == 0 && count%2 == 0) {

                if(charArr[i] == ' ') {
                    count ++;
                    continue;
                } else {
                    charArr[i] = Character.toUpperCase(charArr[i]);
                }

            } else if(i%2 == 1 && count%2 == 1) {

                if(charArr[i] == ' ') {
                    count++;
                    continue;
                } else {
                    charArr[i] = Character.toUpperCase(charArr[i]);
                }

                // 나머지 문자들은 소문자로 처리
            } else {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }

        }

        answer = String.valueOf(charArr);

        return answer;
    }

}
