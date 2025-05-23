package codekata;

public class FindKim {

    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        // 배열의 크기 제한
        if(1 <= seoul.length && seoul.length <= 1000) {
            // 원소의 크기 제한
            for (String s : seoul) {
                if (0 == s.length() || s.length() > 20) {
                    throw new IllegalArgumentException ("배열내 원소의 크기를 확인해주세요.");
                }
            }
            // for 문으로 index 탐색하기
            for(i = 0; !seoul[i].equals("Kim"); i++) {
            }
        } else {
            throw new IllegalArgumentException("배열의 크기를 확인해 주세요.");
        }
        answer = ("김서방은 " + String.valueOf(i) + "에 있다") ;
        return answer;
    }

}
