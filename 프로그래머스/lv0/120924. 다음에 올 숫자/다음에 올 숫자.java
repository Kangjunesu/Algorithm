class Solution {
    public int solution(int[] common) {
        
        if(common[1]-common[0] == common[2]-common[1]) { //등차 수열이면
            return common[common.length-1]+(common[1]-common[0] );
        }else{
            return common[common.length-1]*(common[1]/common[0]);
        }
    }
}