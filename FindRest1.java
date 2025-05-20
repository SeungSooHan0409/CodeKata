package codekata;

public class FindRest1 {

    public int solution(int n) {
        int answer = 0;
        int i = 0;
        // 나머지가 1이 되면 반복문을 break 함.
        if(3 <= n && n <= 1000000) {
            for (i = 1 ; i < n ; i++) {
                if(n%i == 1) {
                    break;
                }
            }
        }
        answer = i;
        return answer;
    }

}
