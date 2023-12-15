class Solution {
    public void moveZeroes(int[] nums) {
       int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                s++;
            }
            else if(s>0)
            {
                int temp=nums[i];
                nums[i]=0;
                nums[i-s]=temp;
            }
        }
    }
}