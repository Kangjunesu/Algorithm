import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int sum=0;
        Arrays.sort(d);
        
        //총 예산 (sum)
        for(int a:d){
            sum+=a;
        } 

        int cnt =0;
        for(int i=0; i<d.length; i++){
            if(sum>budget){
                sum -= d[d.length-i-1];
                cnt++;
            }else{
                break;
            }
        }     
       
        return d.length-cnt;
    }
}