package codekata.Lv1;

public class GuessCollatz {

    public int solution(int num) {
        int answer = 0;
        int i = 0;
        // 숫자 범위 지정
        if(1 <= num && num <= 8000000) {
            // num 이 1인 경우
            if (num == 1) {
                answer = 0;
            }
            // num 이 1이 아닌 경우, for 문 안에 if 문으로 짝수인 경우, 홀수인 경우를 구분하여 계산
            else {
                for(i = 0; i != 500 && num != 1; i++) {
                    if(num%2 == 1) {
                        num += ((num*2) +1 );
                    } else if (num%2 == 0) {
                        num /= 2;
                    }
                }
                // 연산된 num 이 1인지 확인
                if(num == 1) {
                    answer = i;
                } else {
                    answer = -1;
                }
            }
        }

        return answer;
    }

}
