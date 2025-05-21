package codekata;

public class DistinguishIntegerSquareRoot {

    public long solution(long n) {
        long answer = 0;
        long distinct = 0;
        int x = 0;
        if(0 < n && n <= 50000000000000L) {
            // 정수 제곱근이라면 해당 정수(i)로 나누면 몫으로 같은 정수(i)가 나와야함.
            for(int i = 1; Math.pow(i,2) <= n; i++ ){
                distinct = n/i;
                if(distinct == i) {
                    break;
                }
            }
            // distinct 에 저장된 값이 정수 제곱근인지 판별하여 answer 값 설정
            if(Math.pow(distinct,2) == n) {
                answer = (long)Math.pow((distinct+1),2);
            } else {
                answer = -1;
            }
        } else {
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }
        return answer;
    }

}
