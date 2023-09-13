import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        // String tmp;
        // for(int i=0; i< callings.length; i++){
        //     for(int j = 0; j< players.length; j++){
        //         if(callings[i].equals(players[j])){
        //            tmp = players[j - 1];
        //            players[j-1]=players[j];
        //            players[j]= tmp;
        //            break;
        //         }
        //     }
        // }
        // return players;
        
        Map<String, Integer> playersMap = new HashMap<>(players.length);

        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }

        String tmp;
        for (String calling : callings) {
            int beforeIdx = playersMap.get(calling);

            playersMap.replace(calling, playersMap.get(calling)-1);
            tmp = players[beforeIdx-1];
            playersMap.replace(tmp, (playersMap.get(tmp))+1);


            players[beforeIdx-1] = calling;
            players[beforeIdx] = tmp ;
        }
     return players;
       
    }
}