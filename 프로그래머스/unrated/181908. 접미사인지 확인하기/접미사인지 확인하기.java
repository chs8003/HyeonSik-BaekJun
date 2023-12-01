class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++){
            String suffix = my_string.substring(i);
            if(suffix.equals(is_suffix)){
            return 1;
                
            }
        }   
        return 0;
    }
}