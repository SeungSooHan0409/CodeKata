package codekata;

public class SumOfDigits {

    public int solution(int n) {
        int answer = 0;

        // if 문으로 모두 작성시
        // if(0 < n && n <= 9) {
        //     answer = n;
        // } else if (10 < n && n <= 99) {
        //     answer = (n/10 + n%10)
        // } else if (100 < n && n <= 999) {
        //     answer = (n/100 + (n%100)/10 + (n%100)%(10))
        // } else if (1000 < n && n <= 9999) {
        //     answer  = (n/1000 + (n%1000)/100 + ((n%1000)%100)/10 + (((n%1000))%100)%10)
        // } ...

        // n의 자릿수가 i 일때 공식 (너무 복잡해서 표현하기가 힘듬)
        // answer = (n/10^i) + (n%10^i)/10^(i-1) + (n%10^i)%10^(i-1)/10^(i-2) +
        // (n%10^i)%10^(i-1)%10^(i-2)/10^(i-3)+ ... + (n%10^i)%10^(i-1)%10^(i-2)%...%(10^2)/10^1 +
        // (n%10^i)%10^(i-1)%10^(i-2)%...%(10^2)%10^1

        // 1을 계속 빼는 반복문 만들어보기
        int untilZero = n;
        int i = 0;
        int j = 0;
//         // 1의 자리
//         for(i = 1; untilZero%10 != 0; i++) {
//             untilZero -= 1;
//         }
//         answer += i;

//         // 10의 자리
//         for(i = 1; untilZero%100 != 0; i++) {
//             untilZero -= 10;
//         }
//         answer += i;

        // 위 두 for 문을 참조하여 중첩 for 문으로 변경
        for(j = 0; ((int) Math.pow(10, j)) - 1 < n; j++) {
            for(i = 1; untilZero % ((int) Math.pow(10, j+1)) != 0; i++) {
                untilZero -= (int) Math.pow(10, j);
                if(untilZero % ((int) Math.pow(10, j+1)) == 0) {
                    answer += i;
                }
            }
        }
        return answer;
    }

}
