package codekata.Lv3;

public class PartOfSmallness {

    public int solution(int[][] sizes) {
        int answer = 0;
        int element = 0;
        int biggest = 0;
        int row = 2;
        int realHeight = Integer.MAX_VALUE;
        int realWidth = Integer.MAX_VALUE;
        int filteredHeight = sizes[0][1];
        int filteredWidth = sizes[0][0];


        // 제한사항 적용
        if(1 <= sizes.length && sizes.length <= 10000) {

            for(int i = 0; i < sizes.length; i++) {

                int w = sizes[i][0];
                int h = sizes[i][1];

                if(!(1 <= w && w <= 1000 && 1 <= h && h <=1000)) {

                    throw new IllegalArgumentException("가로 길이 혹은 세로 길이 초과!");

                }
            }

            // 제일 큰수를 하나 찾기
            for(int i = 0; i < sizes.length; i++) {
                for(int j = 0; j <= 1; j++) {
                    element = sizes[i][j];

                    // 가장 큰 수를 저장 및 열의 위치 저장
                    if(biggest <= element) {
                        biggest = element;
                        row = j;
                    }
                }
            }

            // 디버깅용
            System.out.println("가장 큰수 : " + biggest);
            System.out.println("row : " + row);

            // 저장된 열의 위치로 biggest 가 가로일때와 세로일때의 조건을 나눔.
            // 나눈 조건에서 명함의 최적길이를 알아냄.



            for(int i = 0; i < sizes.length; i++) {
                int height = sizes[i][1];

                int[] arr1 = {biggest, height};
                int[] arr2 = {height, biggest};

                boolean isBreak = false;

                for(int j = 0; j < sizes.length; j++) {
                    int[] arr = {sizes[j][0], sizes[j][1]};

                    if(!((arr[0] <= arr1[0] && arr[1] <= arr1[1]) ||
                            arr[0] <= arr2[0] && arr[1] <= arr2[1])) {

                        isBreak = true;
                        break;

                    }
                }

                if(isBreak) {
                    continue;
                } else  {
                    filteredHeight = height;

                    if(filteredHeight <= realHeight) {
                        realHeight = filteredHeight;
                    }
                }
            }


            for(int i = 0; i < sizes.length; i++) {
                int width = sizes[i][0];

                int[] arr1 = {width, biggest};
                int[] arr2 = {biggest, width};

                boolean isBreak = false;

                for(int j = 0; j < sizes.length; j++) {
                    int[] arr = {sizes[j][0], sizes[j][1]};

                    if(!((arr[0] <= arr1[0] && arr[1] <= arr1[1]) ||
                            arr[0] <= arr2[0] && arr[1] <= arr2[1])) {

                        isBreak = true;
                        break;

                    }
                }

                if(isBreak) {
                    continue;
                } else  {
                    filteredWidth = width;

                    if(filteredWidth <= realWidth) {
                        realWidth = filteredWidth;
                    }
                }
            }

        }

        // 디버깅용
        System.out.println("높이 :" + realHeight);
        System.out.println("길이 : " + realWidth);

        if(realHeight <= realWidth) {
            answer = realHeight*biggest;
        } else if (realWidth < realHeight) {
            answer = realWidth*biggest;
        }

        return answer;
    }

}
