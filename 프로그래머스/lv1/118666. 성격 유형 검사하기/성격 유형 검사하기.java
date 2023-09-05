import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> a = new HashMap<>(choices.length);

        for(int i =0; i< choices.length; i++){
            if(choices[i]>=4){
                choices[i] = choices[i]-4;
                survey[i] = survey[i].charAt(1)+"";
            }else{
                choices[i] = 4-choices[i];
                survey[i] = survey[i].charAt(0)+"";
            }

            if(a.containsKey(survey[i])){
                int b = a.get(survey[i]);
                a.put(survey[i],b+choices[i]);
            } else {
                a.put(survey[i], choices[i]);
            }
        }
        // System.out.println(Arrays.toString(survey));
        // System.out.println(Arrays.toString(choices));
        // System.out.println(a);

        String[][] k = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        for (int i = 0; i < 4; i++) {

            Integer one = a.get(k[i][0]);
            Integer two = a.get(k[i][1]);
            // System.out.println(k[i][0] + ":" + one);
            // System.out.println(k[i][1] + ":" + two);

            if (two == null || (one != null && one >= two)) {
                answer+=k[i][0];
            } else if (one == null || (two != null && one < two)) {
                answer+=k[i][1];
            }
            // System.out.println(answer);
            // System.out.println();


        }
        return answer;
    }
}