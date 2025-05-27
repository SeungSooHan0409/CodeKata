package codekata.Lv1;

import java.util.Arrays;

public class ArrayOfNoRest {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int j = 0;
        // divisor 범위, arr 크기 제한사항
        if (0 < divisor && 1 <= arr.length) {
            // arr 원소의 범위 제한사항
            for(int i : arr) {
                if(i<1) {
                    throw new IllegalArgumentException("원소는 자연수여야 합니다.");
                }
            }

            // 반복1. 몇개가 나누어 떨어지는지 알아냄.
            for(int i = 0; i < arr.length; i++) {
                if(arr[i]%divisor == 0) {
                    j++;
                }
            }

            // 나누어 떨어지는 원소가 들어갈 배열 생성
            int[] noRest = new int[j];
            j = 0;

            // 반복2. divisor 로 나누어 떨어지는값만 담기
            for(int i = 0; i < arr.length; i++) {
                if(arr[i]%divisor == 0) {
                    noRest[j] = arr[i];
                    j++;
                }
            }

            // 만든 배열 오름차순으로 정렬
            Arrays.sort(noRest);

            // 만든 배열에 원소가 있으면 answer 에 할당
            if (noRest.length == 0) {
                int[] noElement  = {-1};
                answer = noElement;
            } else {
                answer = noRest;
            }

        } else {
            throw new IllegalArgumentException("divisor 값 혹은 arr 크기를 확인해주세요.");
        }

        return answer;
    }

}
