import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        arrList.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]){
                arrList.add(arr[i]);
            }
        }
        
        int i=0;
        int[] answer = new int[arrList.size()];
        for(int a : arrList){
            answer[i++] = a;
        }      
      
        return answer;
    }
}