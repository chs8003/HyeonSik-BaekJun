class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer1 = 0;
        int answer2 = 0;

        // 각 배열의 합을 계산
        for (int i = 0; i < arr1.length; i++) {
            answer1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            answer2 += arr2[i];
        }

        if (arr1.length != arr2.length) {
            return (arr1.length > arr2.length) ? 1 : -1;
        } else {
            return (answer1 > answer2) ? 1 : ((answer1 < answer2) ? -1 : 0);
        }
    }
}