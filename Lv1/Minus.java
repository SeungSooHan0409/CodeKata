package codekata.Lv1;

public class Minus {

    public int solution(int num1, int num2) {
        int result = (num1 - num2);
        return result;
    }
    public static void main (String[] args) {
        Minus sol = new Minus();

        System.out.println("num 1 : " + 7);
        System.out.println("num 2 : " + 1);
        System.out.println("result : " + sol.solution(7,1));
    }

}
