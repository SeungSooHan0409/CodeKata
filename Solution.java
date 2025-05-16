package codekata;

import org.w3c.dom.ls.LSOutput;

class Solution {


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


