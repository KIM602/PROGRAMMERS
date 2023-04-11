import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
        //범위가 from ~ to이기 때문에 +1을 해줘야 num2값이 들어감
    }
}