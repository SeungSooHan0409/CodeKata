package codekata;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public int solution(String t, String p) {
        int answer = 0;
        BigInteger changeP = new BigInteger(p);

        // 제한 사항
        if(1 <= p.length() && p.length() < 18 && p.length() <= t.length() && t.length() <= 10000) {

            // substring, compareTo, 반복문으로 해결
            for(int i = 0; i + p.length() <= t.length(); i++) {

                String partOfT = t.substring(i, i+(p.length()));

                BigInteger changeT = new BigInteger(partOfT);

                if(changeT.compareTo(changeP) <= 0) {
                    answer += 1;
                }

            }

        }

        return answer;
    }

    // 또다른 답안
//    public int solution(String t, String p) {
//        int answer = 0;
//
//        // 제한 사항
//        if(1 <= p.length() && p.length() <= 18 && p.length() <= t.length() && t.length() <= 10000) {
//
//            // substring, compareTo, 반복문으로 해결
//            for(int i = 0; i + p.length() <= t.length(); i++) {
//
//                String partOfT = t.substring(i, i+(p.length()));
//
//                if(partOfT.compareTo(p) <= 0) {
//                    answer += 1;
//                }
//
//            }
//
//        }
//
//        return answer;
//    }

}


