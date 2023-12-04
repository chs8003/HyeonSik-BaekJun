class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for(int i=0; i<rny_string.length(); i++){
            answer = rny_string.replace("m","rn");
        }
        
        return answer;
    }
}