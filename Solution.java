package codekata;

import org.w3c.dom.ls.LSOutput;

class Solution {


    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        boolean valueCheck;
        if(1<=arr.length && arr.length<=100){
            for(int i = 0; i < arr.length; i++){
                valueCheck = -10000<=arr[i] && arr[i]<=10000;
                if(valueCheck==false){
                    throw new IllegalArgumentException("올바른 값이 아닙니다.");
                }
            }
        }
        for (int element : arr) {
            sum += element;
        }
        answer = sum/arr.length;

        return answer;
    }

}


