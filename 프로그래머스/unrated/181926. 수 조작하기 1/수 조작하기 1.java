class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int i=0; i<control.length(); i++){
        char number = control.charAt(i);
        switch (number) {
            case 'w':
                answer +=1;
                break;
            case 's':
                answer-=1;
                break;
            case 'd':
                answer+=10;
                break;
            case 'a':
                answer -=10;
                break;
            default:
                break;
        }
        }
        return answer;
    }
}