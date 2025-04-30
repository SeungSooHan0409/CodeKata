package codekata;

class Solution2 {

    public int solution(int num1, int num2) {
        if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
            int result = num1 * num2;
            System.out.println(result);
            return result;
        } else{
            return 0;
        }
    }


    public static void main(String[] args) {

        Solution2 sol = new Solution2();

        sol.solution(3,4);
        sol.solution(27,19);

    }
}
