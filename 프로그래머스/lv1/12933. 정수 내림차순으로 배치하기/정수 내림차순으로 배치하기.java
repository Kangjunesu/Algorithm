import java.util.*;
class Solution {
    public long solution(long n) {
        long answer =0;

        String n2= n+"";
        long [] nArray =new long[n2.length()];
        String [] nString = new String[n2.length()];


        for(int i=0; i<n2.length(); i++){
            nArray[i] = Long.parseLong(String.valueOf(n2.charAt((n2.length()-1)-i)));
                   }
        Arrays.sort(nArray);  //오름차순의 배열로.
        

        for(int i =0; i< nArray.length; i++){
            nString[i] =nArray[nArray.length-1-i]+"";
        }  //내림차순으로 뒤집은 배열을 nString 문자열 배열에 저장.
        
        n2 ="";  //위에서 사용한 n2를 빈문자열로 초기화
        for(String a : nString){
            n2+=a;
        }
        answer = Long.parseLong(n2);
        return answer;
    }
}