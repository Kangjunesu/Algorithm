class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] sChar = s.toCharArray();  //char배열로       


      if(sChar.length!=4 && sChar.length!=6){
            answer = false;            
        }else{
            for(int i=0; i<sChar.length; i++) {
                if (('a' <= sChar[i] && sChar[i] <= 'z') || ('A' <= sChar[i] && sChar[i] <= 'Z')) {
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}