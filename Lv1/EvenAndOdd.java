package codekata.Lv1;

public class EvenAndOdd {

    public String solution(int num) {
        String answer = "";
        if(num>=0){
            if(num%2 == 1) {
                answer = "Odd";
            } else if(num%2 == 0) {
                answer = "Even";
            }
        } else if (num<0){
            if(num%2 == -1) {
                answer = "Odd";
            } else if(num%2 == 0) {
                answer = "Even";
            }
        }
        return answer;
    }

}
