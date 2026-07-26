class Solution {
    public void nextPermutation(int[] nums) {
       int pivot =-1;
       int n= nums.length;
       for(int i=n-2;i>=0;i--)
       {
            if(nums[i] < nums[i+1])
            {
                pivot = i;
                break;
            }

       }

       if(pivot == -1)
       {    int i=0;
            int j=n-1;
            while(i<j)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            } 
            return;       
       } 

        for(int i=n-1;i>0;i--)
        {
            if(nums[i] > nums[pivot])
            {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }

        int p=pivot+1;
        int k=n-1;
        while(p<k)
        {
            int temp = nums[p];
            nums[p] = nums[k];
            nums[k] = temp;

            p++;
            k--;
        }


    }
}