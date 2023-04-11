class Solution {
    public int solution(int price) {
        int answer = 0;
        
        //큰 수부터 점점 작은 수로 내려가는 것이 포인트
        if (price >= 500000)
            answer = (int)(price * 0.8);
        else if (price >= 300000)
            answer = (int)(price * 0.9);
        else if (price >= 100000)
            answer = (int)(price * 0.95);
        else
            answer = price; //가격이 100000만원 미만일 때 주의 
        return answer;
    }
}