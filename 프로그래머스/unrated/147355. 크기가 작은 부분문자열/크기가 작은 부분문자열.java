import java.util.*;


class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long Long_p = Long.parseLong(p);        

        for(int i=0; i<t.length()-p.length()+1; i++){

            String raw =t.substring(i, i+p.length());
            long a = Long.parseLong(raw);

            if(a<=Long_p){
                answer++;
            }
        }
        return answer;
    }
}