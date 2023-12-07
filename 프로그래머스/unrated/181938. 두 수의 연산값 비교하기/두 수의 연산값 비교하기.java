import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer1 = 0;
        String result1 = Integer.toString(a) + Integer.toString(b);
        answer1 = Integer.parseInt(result1);        
        
        if(answer1 == 2*a*b){
            return answer1;       
        }
       
        
         return Math.max(answer1, 2*a*b);
    }
}