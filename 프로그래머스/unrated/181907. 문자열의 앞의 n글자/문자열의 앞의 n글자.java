class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
           answer =  my_string.substring(0,n);
        }      
        
        
        return answer;
    }
}