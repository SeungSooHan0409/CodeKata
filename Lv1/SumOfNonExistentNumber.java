package codekata.Lv1;

public class SumOfNonExistentNumber {

    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        // 배열의 크기 제한
        if(0 < numbers.length && numbers.length <= 9) {

            // element 의 크기 제한
            for(int i : numbers) {
                if(0 > i || i > 10) {
                    throw new  IllegalArgumentException("원소값을 확인해주세요.");
                }
            }

            // 배열의 모든 숫자 더하기
            for(int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            // 1~9 의 합에서 sum 을 빼면 없는숫자들의 합
            answer = 45 - sum;

        }
        return answer;
    }

}
