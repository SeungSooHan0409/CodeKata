package codekata.Lv3;

public class ThreeMusketeers {

    public int solution(int[] number) {
        int answer = 0;
        int al = number.length;

        // 제한사항
        if(3 <= number.length && number.length <= 13) {

            // 전체 경우의 수 :  al*(al-1)*(al-2)/3!
            // 중첩 for 문 으로 경우의 수 계산
            for(int i = 0; i < al; i++) {

                for(int j = 0; j < al; j++) {

                    if(j == i) {
                        continue;
                    }

                    for(int k = 0; k < al; k++) {
                        if(k == i || k == j) {
                            continue;
                        }

                        if(number[i] + number[j] + number[k] == 0) {
                            answer++;
                        }
                    }
                }
            }

        }

        // 3! 으로 answer 나누기
        answer = answer / 6;
        return answer;
    }

}
