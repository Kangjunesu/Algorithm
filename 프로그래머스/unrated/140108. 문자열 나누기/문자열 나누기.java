import java.util.*;

class Solution {
    public int solution(String s) {
        int answer =1;
        char std = s.charAt(0);
        int cnt = 1;


        for (int i = 1; i < s.length(); i++) {

            if(std==s.charAt(i)){
                cnt++;
            }else{
                cnt--;

                    if(cnt==0 && i< s.length()-1){
                        answer++;
                        i++;
                        std = s.charAt(i);
                        cnt=1;
                    }

            }        
        }
        return answer;
    }
}