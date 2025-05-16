package codekata;

public class EvenAndOdd {
    public String solution(int num) {
        String answer = "";
        if(num%2 == 1) {
            answer = "Odd";
        } else if(num%2 == 0) {
            answer = "Even";
        }
        return answer;
    }
}
