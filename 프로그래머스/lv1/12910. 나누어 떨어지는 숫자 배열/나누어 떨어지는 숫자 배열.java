import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
       
        int[] divided = new int[arr.length];  
        //나누어 떨어지는 수만 따로 모으는 배열.

        int count=0;
        for (int j : arr) {
            if (j % divisor == 0) {
                divided[count] = j;
                count++;
            }  //나누어 떨어지는 것의 개수 count-> answer 배열의 크기.
        }
        
        if (count ==0){
            int[] answer = {-1};
            return answer;
        }else{
            int[] answer = new int[count];
            answer = Arrays.copyOfRange(divided,0,count);
            Arrays.sort(answer);
            return answer;
        }
        
    }
}