class Solution {
    public int solution(int[] nums) {
         int sum = 0;
        int count =0;

        for(int a =0; a< nums.length; a++){
            for(int b=a+1; b<nums.length; b++ ){
                for(int c=b+1; c< nums.length; c++){
                    sum = nums[a]+nums[b]+nums[c];
                    int sqrt = (int)Math.sqrt(sum);
                    boolean sosu = true;
                        for(int d =2; d<=sqrt; d++){
                            if(sum%d==0){
                                sosu =false;
                                break;
                            }
                        }
                    if(sosu) {
                        count++;
                    }
                }
            }
        }       
       

        return count;
    }
}