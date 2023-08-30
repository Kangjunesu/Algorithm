import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<Character> removeSkip = new ArrayList<>();
        for(char i ='a'; i<='z'; i++){
            removeSkip.add(i);
        }

        for (char c : skip.toCharArray()) {
            removeSkip.remove(Character.valueOf(c));
        }

        int removeSkipLength = removeSkip.size();

        for(int i=0; i<s.length(); i++){
            int k = removeSkip.indexOf(s.charAt(i));
//            System.out.println(k);  // 0 17 8 8  15

            if(removeSkipLength-index<=0){
                index = index - removeSkipLength;

                if(k>=removeSkipLength-index){
                    answer +=removeSkip.get(index-(removeSkipLength-k));
                }else{
                    answer += removeSkip.get(k + index);
                }
            }else{
                if(k>=removeSkipLength-index){
                    answer +=removeSkip.get(index-(removeSkipLength-k));
                }else{
                    answer += removeSkip.get(k + index);
                }
            }
        }
        return answer;
    }
}