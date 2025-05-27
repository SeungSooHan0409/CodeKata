package codekata.Lv1;

public class AgePrint {

    public int solution(int age) {
        int printYear;
        if(age > 0 && age <= 120){
            printYear = 2022 - (age-1);
        } else {
            throw new IllegalArgumentException("올바른 나이값이 아닙니다.");
        }
        return printYear;
    }

    public void showAge(int age) {
        System.out.println("나이 : " + age);
        System.out.println("출생연도 : " + solution(age));
    }

}


