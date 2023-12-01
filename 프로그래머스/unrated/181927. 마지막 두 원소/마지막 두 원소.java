class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];
        int last = 0;
        
        if(num_list[n-1] > num_list[n-2]){
            last = num_list[n-1] - num_list[n-2];
        }
        else{
            last = num_list[n-1] * 2;
        }
        
        for(int i=0; i<n; i++){
            answer[i] = num_list[i];
        }
        answer[answer.length-1] = last;    
        return answer;
    }
}