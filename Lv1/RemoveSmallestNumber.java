package codekata.Lv1;

public class RemoveSmallestNumber {

    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        int j = 0;   //  가장 작은 값의 index
        int newIndex = 0;

        // 배열 크기 제한
        if(0 < arr.length) {

            // 제일 작은수 찾아내기
            int min = arr[0];
            for(i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                    j = i;
                }
            }

            // 길이가 arr 보다 1작은 배열 생성
            int[] remove = new int[arr.length - 1];

            // 가장 작은값 제외한 새로운 배열생성, 배열이 비었으면 -1 넣기
            if(remove.length == 0) {
                remove = new int[1];
                remove[0] = -1;
                answer = remove;
            } else {
                for (int k = 0; k < arr.length; k++) {
                    if(k==j) {
                        continue;
                    }
                    remove[newIndex++] = arr[k];
                }
                answer = remove;
            }
        }
        return answer;
    }

}
