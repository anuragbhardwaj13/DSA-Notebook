public class TwiceAtLeastOthers {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i]==max){
                maxIndex=i;
            }

            if (nums[i] *2 > max && nums[i]!=max) {
                System.out.println("-1");
                return;
                
            }
        }
        // return maxIndex;
        System.out.println(maxIndex);
    }
}
