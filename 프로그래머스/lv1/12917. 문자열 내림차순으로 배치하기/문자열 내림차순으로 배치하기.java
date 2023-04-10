import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char [] sCharArray = s.toCharArray();
        Arrays.sort(sCharArray); // 오름차순으로

        for(int i=0; i<s.length(); i++){
            answer +=sCharArray[s.length()-i-1];
        }
        return answer;
    }
}