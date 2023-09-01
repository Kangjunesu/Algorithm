import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        for(int i =0; i< cards1.length; i++){
            for(int j=0; j< cards2.length; j++){
                for(int k =0; k< goal.length; k++){
                    if(cards1[i].equals(goal[k])){
                        cards1[i] = ""+k;
                        goal[k] ="";
                    }
                    if(cards2[j].equals(goal[k])){
                        cards2[j] = ""+k;
                        goal[k] ="";
                    }
                }
            }
        }
        
        for(int i=0; i< goal.length; i++){
            if(goal[i] != ""){
                return "No";
            }
        }
        
        String ox = "";
        List<Integer> cards11 = new ArrayList<>();
        for (String a : cards1) {
            try {

                int num = Integer.parseInt(a);
                if (num >= 0 && num <= 20) {
                    cards11.add(num);
                    ox+="o";
                }
            } catch (NumberFormatException e) {
                ox+="x";
            }
        }

        if (ox.contains("xo")) {
            return "No";
        }


        ox = "";
        List<Integer> cards22 = new ArrayList<>();
        for (String a : cards2) {
            try {
                int num = Integer.parseInt(a);
                if (num >= 0 && num <= 20) {
                    cards22.add(num);
                    ox+="o";
                }
            } catch (NumberFormatException e) {
                ox+="x";
            }
        }

        if (ox.contains("xo")) {
            return "No";
        }

        List<Integer> beforeSort3 = new ArrayList<>(cards11);
        List<Integer> beforeSort4 = new ArrayList<>(cards22);

        Collections.sort(cards11);
        Collections.sort(cards22);


        if(Objects.equals(cards11, beforeSort3) && Objects.equals(cards22, beforeSort4)){
            return "Yes";
        }else{
            return "No";
        }
    }
}