class Solution {
    public int[] solution(long n) {
        String a = n+"";

        char[] n2 = a.toCharArray();
        int[] answer = new int[(int)Math.log10(n)+1];

        for(int i=0; i< answer.length; i++){
            answer[i]=n2[answer.length-1-i]-48;
        }
        return answer;
    }
}