package codekata.Lv2;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // n 제한 조건
        if(1000 < a && a <= 0) {
            throw new IllegalArgumentException("가로 길이 초과!");
        }

        // 가로 길이 만큼 * 추가
        String n = "*".repeat(a);

        int b = sc.nextInt();

        // m 제한 조건
        if(1000 < b && b <= 0) {
            throw new IllegalArgumentException("세로 길이 초과!");
        }

        // 세로 길이만큼 반복
        for(int i = 1; i <= b; i++) {
            System.out.println(n);
        }

    }

}
