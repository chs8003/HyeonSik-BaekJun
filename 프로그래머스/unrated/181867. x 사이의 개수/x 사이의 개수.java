class Solution {
    public int[] solution(String myString) {
        // 문자열을 "x"를 기준으로 나눈 후 각 부분 문자열의 길이를 저장할 배열
        String[] parts = myString.split("x", -1);
        
        // 배열의 길이만큼 정수 배열 생성
        int[] answer = new int[parts.length];
        
        // 나눠진 각 부분 문자열의 길이를 answer 배열에 저장
        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();
        }
        
        return answer;
    }
}