public class solu {
    
    public static int xorBeauty(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
        public static void main(String[] args) {
            int []nums = {15,45,20,2,34,35,5,44,32,30};  
                System.out.println(xorBeauty(nums));
        }
    
}
