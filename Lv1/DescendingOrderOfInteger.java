package codekata.Lv1;

import java.util.Arrays;

public class DescendingOrderOfInteger {

    public long solution(long n) {
        long answer = 0;
        int i = 0;
        // n의 자릿수 세기
        for(i = 1; (long)(n/Math.pow(10,i)) != 0;i++) {
        }

        // 자릿수 만큼의 길이를 가진 배열 만들기
        long[] arr = new long[i];

        //배열에 값넣기
        for (int j = 0; j < i ; j++) {
            arr[j] = n%10;
            n/=10;
        }

        // 배열을 오름차순으로 정렬하기 - Arrays 를 import 하지않으니 안돌아갔음.
        Arrays.sort(arr);

        // 정렬한 배열로 숫자만들기
        for (i = 0; i < arr.length; i++) {
            answer += (arr[i])*Math.pow(10,i);
        }

        return answer;
    }

}
