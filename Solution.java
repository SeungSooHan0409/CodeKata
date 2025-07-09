package codekata;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public String[] solution(String[] strings, int n) {

        // 제한 사항
        if(1 <= strings.length && strings.length <= 50) {

            // 원소길이 제한
            for(String s : strings) {
                if(!(1 <= s.length() && s.length() <= 100)) {
                    throw new IllegalArgumentException("원소 길이 초과!");
                }
            }

            // 선택정렬 사용
            for(int i = 0; i < strings.length - 1; i++) {

                // 초기 인덱스값 할당
                int minIndex = i;

                // 이전 문자와 크기 비교
                for(int j = i + 1; j < strings.length; j++) {

                    // 비교할 문자1
                    char min = strings[minIndex].charAt(n);

                    // 비교할 문자2
                    char temp = strings[j].charAt(n);

                    // 비교후 작은 값의 인덱스를 기억
                    if(temp < min) {
                        minIndex = j;
                    }
                    // 사전순 정렬도 수행
                    else if (temp == min && strings[minIndex].compareTo(strings[j]) > 0) {

                        minIndex = j;

                    }
                }

                // 최소값과 자리변경
                String tempStr = strings[i];
                strings[i] = strings[minIndex];
                strings[minIndex] = tempStr;

            }

        }

        return strings;
    }

}


