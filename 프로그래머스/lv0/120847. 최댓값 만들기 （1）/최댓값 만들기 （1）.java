import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        //배열 정렬(오름차순)
        Arrays.sort(numbers);
        //마지막 * 마지막-1 인덱스
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
}