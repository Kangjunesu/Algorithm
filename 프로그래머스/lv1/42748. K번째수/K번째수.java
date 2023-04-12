import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i< commands.length; i++){  //commands의 인덱스 순서로
            if(commands[i][1]-commands[i][0]==0){
                answer[i]= array[commands[i][0]-1];
            }else{
                int[] subArray;  
                subArray = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
                Arrays.sort(subArray);
                answer[i]=subArray[commands[i][2]-1];
            }
        }
        return answer;
    }
}