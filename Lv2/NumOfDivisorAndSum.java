package codekata.Lv2;

public class NumOfDivisorAndSum {

    public int solution(int left, int right) {
        int answer = 0;
        int numOfDivisor = 0;

        // 매개변수 제한사항
        if(1<= left && left <= 1000 && 1<= right && right <= 1000) {

            // 약수의 개수를 판별하고 누적합 구하기
            for(int i = left; i <= right; i++) {

                for(int j = 1; j <= i; j++) {
                    if(i%j == 0) {
                        numOfDivisor += 1;
                    }
                }

                if(numOfDivisor%2 == 0) {
                    answer += i;
                } else {
                    answer -= i;
                }
                numOfDivisor = 0;
            }

        }
        return answer;
    }

}
