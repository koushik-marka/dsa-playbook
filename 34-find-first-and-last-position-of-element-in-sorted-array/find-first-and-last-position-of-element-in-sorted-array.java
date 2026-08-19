class Solution {
    public int bsl(int[] nums,int k,int s,int e){
        int av=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==k){
                av=m;
                e=m-1;
            }
            else if(nums[m]<k){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return av;
    }
    public int bsr(int[] nums,int k,int s,int e){
        int av=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==k){
                av=m;
                s=m+1;
            }
            else if(nums[m]<k){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return av;
    }
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
        return new int[] {bsl(nums,target,start,end),bsr(nums,target,start,end)};
    }
}