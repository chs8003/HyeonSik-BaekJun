class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = myString.toLowerCase();
        
        for(int i=0; i<myString.length(); i++){
            if(result.contains(pat.toLowerCase())){
                return 1;
            }    
        }
        
        
        return answer;
    }
}