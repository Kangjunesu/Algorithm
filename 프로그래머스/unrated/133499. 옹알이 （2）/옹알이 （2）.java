import java.util.*;


class Solution {
    public int solution(String[] babbling) {
        
        String[] speakable = {"aya", "ye", "woo", "ma"};      // 말할 수 있는것
        String [] yunsok = {"ayaaya", "yeye", "woowoo", "mama"};

        List<String> firstList = new ArrayList<>();

        for(int i =0; i< babbling.length; i++){
            for(int j=0; j< speakable.length; j++){
                if(babbling[i].contains(speakable[j])){
                    firstList.add(babbling[i]);  // 하나라도 겹치는 것만 리스트로. 터무니 없는 것 제외
                    break;
                }
            }
        }


        //연속된게 하나라도 있으면 제외
        for(int i =0; i< firstList.size(); i++){
            for(int j=0; j<yunsok.length; j++){
                if(firstList.get(i).contains(yunsok[j])){ 
                    firstList.set(i,"X");
                }
            }
        }

        List<String> secondList = new ArrayList<>();
        for(String a : firstList){
            if(a!="X"){
                secondList.add(a);
            }
        }  // 연속된거 제거된 리스트 secondList


        for(int i=0; i< secondList.size(); i++){
           for(int j=0;j< speakable.length; j++){
               secondList.set(i,secondList.get(i).replace(speakable[j]," "));
           }
        }

        int count =0;

        for(int i =0; i< secondList.size(); i++){
            
            secondList.set(i,secondList.get(i).replace(" ",""));
            if(secondList.get(i).equals("")){
                count++;
            }
            
        }
        return count;
    }
}