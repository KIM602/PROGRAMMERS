class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = (numer1 * denom2) + (numer2 * denom1);
        int bottom = denom1 * denom2;
        
        for(int i = top-1; i > 1; i--) {
            if(top % i == 0 && bottom % i == 0) {
                top /= i;
                bottom /= i;
            }
        }
        
        int[] answer = { top, bottom };
        return answer;
    }
}