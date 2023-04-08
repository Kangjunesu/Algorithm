class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] sChar = s.toCharArray(); //s를 Char배열로
        // System.out.println(Arrays.toString(sChar));  //확인

        int p=0;
        int y=0;
        for(int i =0; i< sChar.length; i++){
            if(sChar[i] =='p' || sChar[i] =='P'){
                p++;
            }
            if(sChar[i]=='y'|| sChar[i] =='Y'){
                y++;
            }
        }       

        if(p==y || (p==0 &&y==0)){
            answer =true;
        }else{
            answer =false;
        }       

        return answer;
    }
}