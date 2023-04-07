class Solution {
    public double solution(int[] arr) {
        double answer;
        double sum =0;     

      
        for(int c : arr){
            sum +=c;
        }

        answer = sum/arr.length;
        return answer;
    }
}