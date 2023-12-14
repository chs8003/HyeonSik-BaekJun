class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] out = binomial.split(" ");
        int a = Integer.parseInt(out[0]);
        String op = out[1];
        int b = Integer.parseInt(out[2]);
        
       if(op.equals("+")) {
            answer = a + b;
        } else if(op.equals("-")) {
            answer = a - b;
        } else if(op.equals("*")) {
            answer = a * b;
        }
        
        
        return answer;
    }
}