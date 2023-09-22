import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        String foods = "";

        for(int i=1; i< food.length; i++){
            int cnt = food[i]/2;
            for(int j=0; j<cnt; j++){
                foods += (i+"");
            }

        }
        String reverse= new StringBuilder(foods).reverse().toString();

        foods+=0;
        answer = foods+reverse;
        
        return answer;
    }
}