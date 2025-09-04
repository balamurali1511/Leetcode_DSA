class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int a =0;
        int b=0;
        int c= n-1;

        while(b<=c){
            if(nums[b] == 1){
                b++;
            }
            else if(nums[b] ==2){
                int temp = nums[b];
                nums[b] = nums[c];
                nums[c] = temp;
                c--;
            }
            else{
                int temp = nums[b];
                nums[b] = nums[a];
                nums[a] = temp;
                a++;
                b++; 
            }
        }
    }
}
