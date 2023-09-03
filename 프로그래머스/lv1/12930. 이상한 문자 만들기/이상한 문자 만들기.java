import java.util.*;

class Solution {
    public String solution(String s) {
        String s1 = "";
        int k=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                s1+= " ";
                k=0;
            }else{
                if(k%2==0){
                    k++;
                    s1 += Character.toUpperCase(s.charAt(i));
                }else{
                    k++;
                    s1 += Character.toLowerCase(s.charAt(i));
                }
            }
        }
        return s1;
//         String [] sA = s.split(" ");
//         List<String> sL = new ArrayList<>();
//         String sC ="";

//         for(int i=0; i<sA.length; i++){
//             for(int j=0; j<sA[i].length(); j++){
//                 if(j%2==0){
//                     sC += Character.toUpperCase(sA[i].charAt(j));
//                 }else{
//                     sC += Character.toLowerCase(sA[i].charAt(j));
//                 }

//             }
//             sL.add(sC);
//             if(i!=sA.length-1){
//                 sL.add(" ");
//             }
//             sC="";
//         }
//         // System.out.println(sL);

//         for(int i=0; i<sL.size(); i++){
//             sC+= sL.get(i);
//         }
//         return sC;
    }
}