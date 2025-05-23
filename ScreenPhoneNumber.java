package codekata;

public class ScreenPhoneNumber {

    public String solution(String phone_number) {
        String answer = "";
        // 전화번호 길이 제한
        if(4 <= phone_number.length() && phone_number.length() <= 20) {
            // 뒷번호를 제외하고 번호를 가림
            String secret = "*".repeat(phone_number.length()-4);
            String appear = phone_number.substring(phone_number.length()-4);
            answer = secret + appear;
        }
        return answer;

    }

}
