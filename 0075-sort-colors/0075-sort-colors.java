class Solution {
    public void sortColors(int[] nums) {
        mergesort(nums, 0, nums.length-1);
    }

    public void mergesort(int[] nums, int left, int right)
    {
        if(left >= right)
        {
            return;
            
        }
        int mid= (left + right )/2;
        mergesort(nums, left ,mid );
        mergesort(nums, mid+1, right);
        merge(nums,left, mid, right);
    } 

    public void merge(int[] arr, int low, int mid, int high)
    {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        while (left <= mid)
            temp.add(arr[left++]);

        
        while (right <= high)
            temp.add(arr[right++]);

        
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }

   
}