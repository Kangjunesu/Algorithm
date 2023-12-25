import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        String[] arr3 = new String[n];
        String[] arr4 = new String[n];

        for(int i =0; i<n; i++){
            arr3[i] = Integer.toBinaryString(arr1[i]);
            arr4[i] = Integer.toBinaryString(arr2[i]);

            if(arr3[i].length()!=n){
                int k =n-arr3[i].length();
                for(int j=0; j < k ;j++ ){
                    arr3[i] = "0"+arr3[i];
                }
            }

            if(arr4[i].length()!=n){
                int k =n-arr4[i].length();
                for(int j=0; j < k; j++ ){
                    arr4[i] = "0"+arr4[i];
                }
            }
        }

        for(int i=0; i<n; i++){
            String asw="";
            //둘다 0인 경우 공백
            //하나라도 1이면 #

            for(int j=0; j<n; j++){
                if(arr3[i].charAt(j)=='1'){
                    asw +="#";
                }else{
                    if(arr4[i].charAt(j)=='1'){
                        asw +="#";
                    }else{
                        asw += " ";
                    }
                }
            }
            answer[i] =asw;
        }

        return answer;
    }
}