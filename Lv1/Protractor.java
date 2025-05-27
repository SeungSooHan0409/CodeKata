package codekata.Lv1;

public class Protractor {
    public int solution(int angle) {
        int answer = 0;
        if(0 < angle && angle < 90){
            answer = 1;
        } else if(angle == 90){
            answer = 2;
        } else if(90 < angle && angle < 180){
            answer = 3;
        } else if (angle == 180){
            answer = 4;
        } else{
            throw new IllegalArgumentException("올바른 값을 입력해주세요.");
        }
        return answer;
    }

    public void printSolution(int angle) {
        System.out.println(solution(angle));
    }
}
