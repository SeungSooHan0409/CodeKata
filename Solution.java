package codekata;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        // 제한사항
        if(s.length() <= 8000 && 1 <= n && n <= 25) {

            // 유니코드를 이용하여 로직작성
            for(int i = 0; i < s.length(); i++) {

                char toChar = s.charAt(i);

                // 공백이면 반복문 진행
                if(toChar == ' ') {
                    answer.append(" ");
                    continue;
                }

                // int 로 형변환
                int toUnicode = (int) toChar;
                int pushedCode = toUnicode + n;

                // z 에서 밀면 a 로 되돌아가는 조건 설정
                // A-Z : 65 ~ 90
                // a-z : 97 ~ 122
                if(!((65 <= pushedCode && pushedCode <=90) || (97 <= pushedCode && pushedCode <= 122))) {

                    // 대문자 일때
                    if(91 <= pushedCode && pushedCode <= 115) {
                        toUnicode = (pushedCode - 90) + 65 - 1;
                    }
                    // 소문자 일때
                    else if(123 <= pushedCode && pushedCode <= 147) {
                        toUnicode = (pushedCode - 122) + 97 - 1;

                    }

                } else if(97 <= pushedCode && pushedCode <= 115 && Character.isUpperCase(toUnicode)) {
                    toUnicode = 65 - 1 + n - (90 - toUnicode);

                } else {
                    toUnicode = pushedCode;
                }

                // char 로 형변환
                char pushedChar = (char) toUnicode;

                // answer 에 값 입력
                answer.append(pushedChar);

            }

        } else {
            throw new IllegalArgumentException("범위 초과");
        }

        return answer.toString();
    }

}


