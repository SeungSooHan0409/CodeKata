package codekata.Lv2;

import java.util.Arrays;

public class PutStringOrderedDesc {

    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];

        // String 길이제한
        if(1 <= s.length()){

            // String 을 char 로 분해
            for(int i = 0; i < s.length(); i++) {
                arr[i] = s.charAt(i);
            }

            // 배열 오름차순으로 정렬
            Arrays.sort(arr);

            // char 을 String 으로 만들기
            for(int i = 1; i <= s.length(); i++) {
                answer += arr[s.length()-i];
            }

        }
        return answer;
    }

}
