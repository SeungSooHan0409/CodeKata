package codekata.Lv2;

public class CalculateAmount {

    public long solution(int price, int money, int count) {
        long answer = -1;
        // 제한사항
        if(1 <= price && price <= 2500 && 1 <= money && money <= 1000000000 && 1 <= count && count <= 2500) {

            long stackedPrice =  0;

            // 계산하기
            for(int i = 1; i <= count; i++) {
                stackedPrice += (price*i);
            }

            if(money - stackedPrice < 0) {
                answer = stackedPrice - money;
            } else {
                answer = 0;
            }

        }
        return answer;
    }

}
