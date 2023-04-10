import java.util.*;

class Solution {
    public int solution(String s) {
        String newS ="";
        int answer = 0;
        char[ ] sChar = s.toCharArray();
        String[] numStringArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] numIntArray = {0,1,2,3,4,5,6,7,8,9};
        
        if (s.matches("[0-9]+")) {  //숫자로만 되어있을 경우
                return Integer.parseInt(s);
        } else{  //문자도 있을 경우

                for (int i = 0; i < numStringArray.length; i++) {
                    if (s.contains(numStringArray[i])) {
                        s = s.replaceAll(numStringArray[i], numIntArray[i] + "");
                    } // if문 종료
                }  //for문 종료

            answer = Integer.parseInt(s);
            return answer;

        }  //else문 종료
        
     
    }
}